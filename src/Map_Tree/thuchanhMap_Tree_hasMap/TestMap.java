package Map_Tree.thuchanhMap_Tree_hasMap;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer, String> hasMap = new HashMap<>();
        hasMap.put(1,"Thang");
        hasMap.put(2,"Tu");
        hasMap.put(3,"Du");
        hasMap.put(4, "Thang Xoan");
        System.out.println(hasMap + "\n");

        Map<Integer, String> treeMap = new HashMap<>();
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<Integer, String> linkedHasMap = new HashMap<>();
        linkedHasMap.put(5, "Tu Anh");
        linkedHasMap.put(6, "Thao");
        linkedHasMap.put(7, "Duy");
        System.out.println("linkedHasMap "+linkedHasMap.get(6));
        System.out.println("linkedHasMap "+linkedHasMap);
    }
}
