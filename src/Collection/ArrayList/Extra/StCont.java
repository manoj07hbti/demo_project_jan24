package Collection.ArrayList.Extra;

import java.util.HashMap;

public class StCont {

    public void StringCount(String name){
        HashMap<Character ,Integer >charMap=new HashMap<>();
        char []StrArray =name.toCharArray();
        for (char c: StrArray){
            if (charMap.containsKey(c)){
                charMap.put(c,charMap.get(c)+1);
            }else {
                charMap.put(c,1);
            }
        }
        System.out.println(name+" : "+charMap);
    }
    public static void main(String[] args) {
        StCont cont=new StCont();
        cont.StringCount("Idd mohammad");
    }
}
