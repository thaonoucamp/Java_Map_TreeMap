package myPackage;

import java.util.Map;
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<Integer, String>();

        map.put(1, "a");
        map.put(4, "a");
        map.put(2, "a");

        for (Map.Entry<Integer, String> ent : map.entrySet()) {
            System.out.println(ent.getKey() + ent.getValue());
        }

        map.remove(1);
    }
}
// duoc sap xep theo thu tu tang dan;