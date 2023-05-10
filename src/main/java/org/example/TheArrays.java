package org.example;

import java.awt.*;
import java.util.Arrays;

public class TheArrays {
    public static void workingWithArrays() {

        //Array of strings
        String[] colors = new String[5];
        colors[0] = "white";
        colors[1] = "blue";

        System.out.println(Arrays.toString(colors));
        System.out.println(colors[0]);

        //Array of integers
        int[] nums = {100, 200, 300 ,20};

        System.out.println("Print of array:");
        //iterate array and print every element
        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

        System.out.println("Reverse print of array:");
        //reverse iterate
        for (int i = nums.length - 1; i >=  0; i--){
            System.out.println(nums[i]);
        }

        System.out.println("Print by element:");
        for (String color: colors){
            System.out.println(color);
        }
        System.out.println("Using streams to print:");
        Arrays.stream(colors).forEach(System.out::println);

    }
}