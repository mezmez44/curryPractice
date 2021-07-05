package InterviewQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateCharac {
    public static void main(String[] args) {
        String name = "mezmez benamrouz";
        System.out.println(returnDuplicateUsingHashMap1(name));
        System.out.println("***************************");
        System.out.println(streamMethod(name));
    }

    public static String returnDuplicateUsingHashMap1(String name){
        String myString="";
        Map<String,Integer> myMap=new HashMap<>();
        for(String s:name.split("")){
            Integer count =myMap.get(s);
            if(count==null){
                myMap.put(s,1);
            }else{
                myMap.put(s,++count);
            }
        }
        Set<Map.Entry<String,Integer>> mySet= myMap.entrySet();
        for(Map.Entry<String,Integer> m:mySet){
            if(m.getValue()>1){
                myString=myString+","+m.getKey();
            }
        }
        return myString.replaceFirst(",","") ;
    }

    public static String streamMethod(String name){
        String str="";
        Set <String>mySet=new HashSet<>();
        Set <String> newSet= Arrays.asList(name.split("")).stream().filter(m->!mySet.add(m)).collect(Collectors.toSet());
        for(String s:newSet){
            str=str+","+s;
        }
        return str.replaceFirst(",","");
    }
}
