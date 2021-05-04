package basic.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateCharactersInString {
    public static void main(String... s){
        String str = "adewfwegftrcdewfwererecdqwed";
        Map<Character, Integer> map = new HashMap<>();

        Map<String , Long> map1 =   str.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Object::toString, Collectors.counting()));

        for(int i = 0; i < str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }else {
                map.put(str.charAt(i), 1);
            }
        }

        for(Map.Entry<String, Long> m : map1.entrySet()){
            System.out.println(m.getKey() + " ---> " + m.getValue());
        }
    }
}
