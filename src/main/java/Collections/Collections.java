package Collections;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        List<Integer> arraylist = new ArrayList<>();

        for(Integer i = 0; i < 10; i++){
            list.add(i);
            System.out.println(i);
        }

        list.remove(6);
        System.out.println(list);

        list = new LinkedList<Integer>();





        Set<String> hashSet = new HashSet<>();

        LinkedHashSet<String>  linkedHashMSet   = new LinkedHashSet<>();

        TreeSet<String> treeSet = new TreeSet<>();

        HashMap<String, String> hashMap = new HashMap<>();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();

        WeakHashMap<String, String> weakHashMap = new WeakHashMap<>();

        TreeMap<String, String> treeMap = new TreeMap<>();
    }
}
