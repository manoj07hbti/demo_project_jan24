package collection.hash_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMap_Integer {

    // TODO create a hashMap  integer with String value.

    public void HashMap_Int() {


        //HashMap <DataType_Key, DataType_Value> objName= new HashMap();
        LinkedHashMap<Integer, String> mapMobile = new LinkedHashMap<>();

        // insertion Data...

        mapMobile.put(1, "Call Home");
        mapMobile.put(2, "Call Brother");
        mapMobile.put(3, "Call Father");
        mapMobile.put(4, "Call Mother");
        mapMobile.put(5, "Call Friend");

        System.out.println(mapMobile);

        // if read dta from map

        System.out.println(mapMobile.get(3));
    }

    public static void main(String[] arg) {

        HashMap_Integer obj = new HashMap_Integer();
        obj.HashMap_Int();

    }


}
