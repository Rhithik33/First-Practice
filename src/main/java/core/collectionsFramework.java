package core;

import java.util.*;

public class collectionsFramework
{

    public static void main(String[] args) {
        // Collection vs Collections
        // Collection - is an root interface which provides blueprint basic operation for manuplulating a data structure.

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(12);
        integers.add(33);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(45);

        System.out.println(integers);

        // Collections - is a utility class where it contains utlity methods like sorting, searching, disjoint & more

        List<Integer> integers1 = integers;

        Collections.sort(integers);

        System.out.println(integers);

        List<Integer> integers2 = new ArrayList<>(Collections.nCopies(integers1.size(), null));

        Collections.copy(integers2, integers1);

        System.out.println(integers2);

//        System.out.println(Collections.binarySearch(integers, 334));

        System.out.println(Collections.disjoint(integers1, integers));

    }



}
