package convert.list.to.map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListToHashMap {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Sundeep");
		list.add("Deepak");
		list.add("Hariom");
		
		System.out.println("List output");
		list.stream().forEach(System.out::println);
	
		Map<Integer,String> map = new LinkedHashMap<>();
		map = IntStream.range(0,list.size())
	            .mapToObj(index -> index)
	            .collect(Collectors.toMap(Function.identity(),
	                    list::get));
		
		map.forEach((x,y)->System.out.println(x  + "         " + y));
	}

}
