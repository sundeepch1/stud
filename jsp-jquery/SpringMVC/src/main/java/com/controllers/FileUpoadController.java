package com.controllers;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="fileuploadController")
public class FileUpoadController {
	
	@Autowired
	ServletContext servletContext;

	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView getFile() {
		ModelAndView andView = new ModelAndView("fileUpload");
		return andView;
	}
	
	@RequestMapping(value="fileUpload", method= RequestMethod.POST)
	public @ResponseBody Map<String, Object> getFileUpload(MultipartHttpServletRequest request, HttpServletResponse response){
		Map<String,Object> map = new HashMap<String, Object>();
		List<String> list = new ArrayList<String>();
		
		
		Iterator<String> itr = request.getFileNames();
		MultipartFile mpf= null;
		
		while(itr.hasNext()) {
			mpf = request.getFile(itr.next());
			try {
				FileCopyUtils.copy(mpf.getBytes(), new FileOutputStream(servletContext.getRealPath("/resources")+ "/"+ mpf.getOriginalFilename().replace(" ", "-")));
				list.add(mpf.getOriginalFilename());
			} catch (IOException e) {
				// TODO: handle exception
			}
		}
		
		map.put("Status", 200);
		map.put("SucessfulList", list);
		
		return map;
	}
	
}
