package core;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class streams
{
    public static void main(String[] args)
    {

        List<Integer> integers = new ArrayList<>() {{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
            add(8);
        }};

//        for (int i = 0; i < integers.size(); i++)
//        {
//            System.out.println(integers.get(i));
//        }
//
//        int i=0;
//        while (i<integers.size())
//        {
//            System.out.println(integers.get(i));
//            i++;
//        }
//
//        for (Integer integer : integers) {
//            System.out.println(integer);
//        }

        List<Integer> filteredInterhers = integers
                .stream()
                .filter((n) -> n != 8)
                .map((n) -> n*2)
//                .peek((n) -> System.out.println(n))
                .collect(Collectors.toList());


        List<String> filteredStrings = new ArrayList<>() {{add("shyam"); add("rithu");}};
        filteredStrings
                .stream()
                .filter((n) -> n.equals("rithu") || n.equals("shyam"))
                .sorted()
                .limit(2)
                .map((n) -> n+ " heloo")
                .peek((n) -> System.out.println(n))
                        .collect(Collectors.toSet());



//        System.out.println(filteredInterhers);



    }
}
