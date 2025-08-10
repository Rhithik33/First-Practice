package core;

import java.lang.reflect.Array;
import java.util.*;

public class datastructures
{

    public static void main(String[] args) {

        Integer[] in1 = new Integer[5];
        in1[0] = 1;

        // Issue with array - > size
        // dynamic resizing is not available
        int[] in2 = new int[6];

        List<Integer> dynamicArray = new LinkedList<>();
        dynamicArray.add(12);
        dynamicArray.add(12);
        dynamicArray.size();
        dynamicArray.isEmpty();

        List<Integer> dynamixcArray = new ArrayList<>();
        dynamixcArray.add(12);
        dynamixcArray.remove(0);

        List<Integer> vectorAtrray = new Vector<>();
        vectorAtrray.add(12);

        System.out.println(vectorAtrray.getFirst());


        // Hash tables (Map)

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "rithu");
        map.put(2, "shyam");

        System.out.println(map.getOrDefault(3, "null"));
        System.out.println(map.containsKey(3));


        // Set
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(1);
        set.add(3);
        System.out.println(set);

        System.out.println(set.contains(3));


        // 3 strcutes

        // store a numerous number  students ids (duplicate should not exists) - > Set
        // store a list of students ids in order -> List
        // store students & their corresponding rank ->

        Map<String, Integer> studentAndRank = new HashMap<>();
        studentAndRank.put("17bau027", 2);
        studentAndRank.put("17bee019", 2);

        System.out.println(studentAndRank.get("17bee019"));



        // pending Queue, Stack





    }
}
