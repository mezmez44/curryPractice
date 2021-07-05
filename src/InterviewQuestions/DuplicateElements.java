package InterviewQuestions;

import java.util.*;

/*
"java", "javaScript", "Ruby", "c#", "java", "javaScript","c++","Ruby"
 */
public class DuplicateElements {
    public static void main(String[]args){
       String [] languages={"java", "javaScript", "Ruby", "c#", "java", "javaScript","c++","Ruby"} ;
        System.out.println(Arrays.toString(languages));
    }
    public static String[] returnDuplicate(String[]languages){
        String duplicateElem="";
        for(int i=0;i<languages.length-1;i++){
            for(int k=i+1;k<languages.length;k++){
                if(languages[i]==languages[k]){
                    duplicateElem=duplicateElem+languages[i]+",";
                }
            }
        }
        String [] newLanguage=duplicateElem.split(",");
        return newLanguage;
    }
    public static String[] returnDuplicateUsingSet(String[]languages){
        String newString="";
        Set<String> mySet=new LinkedHashSet<>();
        for(String s:languages){
            if(!mySet.add(s)){
                newString = newString + s + ",";
            }
        }
        String [] duplicate=newString.split(",");

        return duplicate;
    }
    public static String[] returnDuplicateUsingHashMap(String[]languages){
//"java", "javaScript", "Ruby", "c#", "java", "javaScript","c++","Ruby","javaScript"
        String myString="";
        Map<String,Integer> myMap=new HashMap<>();
        for(String s:languages){
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
                myString=myString+m.getKey()+m.getValue()+",";
            }
        }
        String []myLastArr=myString.split(",");
        return myLastArr ;
    }
}
