package com.skc.multiple.ds.api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skc.multiple.ds.api.book.repository.BookRepository;
import com.skc.multiple.ds.api.model.book.Book;
import com.skc.multiple.ds.api.model.user.User;
import com.skc.multiple.ds.api.user.repository.UserRepository;

@SpringBootApplication
@RestController
//@ComponentScan(basePackages = "{com.skc.multiple.ds.api.*}")
public class SpringBootMultipleDsApplication {

	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@PostConstruct
	public void addData2DB() {
		userRepository.saveAll(Stream.of(new User(744,"John"), new User(455,"Pitter")).collect(Collectors.toList()));
		bookRepository.saveAll(Stream.of(new Book(111,"Core Java"), new Book(222,"Spring boot")).collect(Collectors.toList()));
	}
	
	@GetMapping(value = "/getUsers")
	public List<User> getUers(){
		return userRepository.findAll();
	}
	
	@GetMapping(value = "/getBooks")
	public List<Book> getBooks(){
		return bookRepository.findAll();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMultipleDsApplication.class, args);
	}

}