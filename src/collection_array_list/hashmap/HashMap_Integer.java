package collection_array_list.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMap_Integer {

    // TODO create a hashMap of integer key and String value.

    public void HashMap_Int(){
        //HashMap <DataType_Key, DataType_Value> objName= new HashMap();

        LinkedHashMap<Integer , String> mapMobile = new LinkedHashMap<>();

        // adding value to map

        mapMobile.put(1 , "For Language");
        mapMobile.put(2 , "For Recharge");
        mapMobile.put(3 , "For Offer");
        mapMobile.put(4 , "For Officer Talk");

        System.out.println(mapMobile);

        // read dta from map

        System.out.println(mapMobile.get(3));
        System.out.println(mapMobile.get(4));


    }

    public static void main(String[] arg){

        HashMap_Integer obj = new HashMap_Integer();
        obj.HashMap_Int();

    }


}
