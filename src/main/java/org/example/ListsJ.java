package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
public class ListsJ {
    public static void workingWithLists(){
        List<String> colors = new ArrayList();

        colors.add("blue");
        colors.add("white");

        //Length of the list
        System.out.println(colors.size());
        //Check for item in the list
        System.out.println(colors.contains("blue"));
        //Print the list
        System.out.println(colors);

        //For loop
        for (String color : colors){
            System.out.println(color);
        }
    }
}
