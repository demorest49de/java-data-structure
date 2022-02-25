package Collections;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        List<Integer> arraylist = new ArrayList<>();

        for(Integer i = 0; i < 10; i++){
            list.add(i);
        }

        list.remove(6);

        list = new LinkedList<Integer>();





        Set<String> hashSet = new HashSet<>();

        LinkedHashSet<String>  linkedHashMSet   = new LinkedHashSet<>();

        TreeSet<String> treeSet = new TreeSet<>();

        HashMap<String, String> hashMap = new HashMap<>();
        LinkedHashMap <String, String> linkedHashMap = new LinkedHashMap<>();

        WeakHashMap<String, String> weakHashMap = new WeakHashMap<>();

        TreeMap<String, String> treeMap = new TreeMap<>();

        Set<Integer> integers = new HashSet<>();

        List<Object> objects = new ArrayList<>();
        objects.add("1vasja");
        objects.add(1);
        objects.add(1l);
        objects.add(1.0);

        System.out.println(objects);

        TreeSet ts = new TreeSet();

        // Добавляем элементы к набору древ
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        ts.add("D");
        System.out.println(ts);

        Map m2 = new HashMap();

        m2.put("Маша", "8");
        m2.put("Михаил", "31");
        m2.put("Олег", "12");
        m2.put("Денис", "14");

        System.out.println();
        System.out.println("Элементы карты");
        System.out.print("\t" + m2);

        var m1 = new TreeMap();

        m1.put("Маша", "8");
        m1.put("Михаил", "31");
        m1.put("Олег", "12");
        m1.put("Денис", "14");

        System.out.println();
        System.out.println("Элементы карты");
        System.out.print("\t" + m1);
    }
}
