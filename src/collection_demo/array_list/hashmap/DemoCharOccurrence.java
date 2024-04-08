package collection_demo.array_list.hashmap;

import java.util.HashMap;

public class DemoCharOccurrence {

    public static void main(String[] args) {

        String input ="AGREEMENT";
        // find occurrence of every alphabate

        char[] characters= input.toCharArray();

        HashMap<Character,Integer> stringOccurrenceMap= new HashMap<>();

        for(char var: characters){

            if(stringOccurrenceMap.containsKey(var)){
                stringOccurrenceMap.put(var, stringOccurrenceMap.get(var)+1);
            }else {
                stringOccurrenceMap.put(var,1);
            }

        }

        System.out.println(stringOccurrenceMap);

    }
}
