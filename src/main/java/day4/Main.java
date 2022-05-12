package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] colors = {"Blue","Grey","Red","Yellow","Green","Black","White"};
        List<String> copyColors = new ArrayList<>(Arrays.asList(colors));
        System.out.println(copyColors);
        copyColors.remove(2);
        copyColors.add(6,"Pink");
        copyColors.add(0,"Orange");
        copyColors.forEach(System.out::println);
        System.out.println();
        List<String> subListColors = copyColors.subList(2,5);
        for (String i : subListColors){
            System.out.println(i);
        }





    }
}
