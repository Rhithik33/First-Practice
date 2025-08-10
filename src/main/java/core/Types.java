package core;

import java.util.Arrays;

public class Types
{

    public static void main(String[] args)
    {

        // Primitive types
        // int, char, float, byte, double
        int a = 22332322; // - > 01
        boolean bool = true;
        float float1 = 0.223322332233232232323F;
        char char1 = 'a';
        byte byte1 = 127;

        double double1 = 0.487243832832832783273288732823823;

        System.out.println(double1);
        System.out.println(float1);

        bool = false;

        int[] a1 = new int[5];
        a1[0] = 1;
        a1[1] = 2;
        a1[2] = 3;
        a1[3] = 4;
        a1[4] = 5;
        Integer[] a2 = new Integer[] {};
        System.out.println(Arrays.toString(a2));

        System.out.println(Arrays.toString(a1));


        // Basic types
         Integer in1 = 23323;
         Double in2 = 9.344343434;
         Float in4 = 9.323732F;
         Boolean bool1= true;
         Boolean bool2 = Boolean.parseBoolean("false");
         Integer integer = Integer.parseInt("1235");
        System.out.println(integer);
        System.out.println(integer.getClass().toString());
        Float.parseFloat("90.3233");


    }





}
