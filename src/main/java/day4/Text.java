package day4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.awt.SystemColor.text;

public final class Text {
    static void text(String text) {
        HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();


        String[] words = text.split("\\W");

        for (String word : words) {
            if (map.containsKey(word)){
                map.put(word, map.get(word) + 1);
            }else
                map.put(word, 1);
            }
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1)
                System.out.println(entry.getKey());
        }
    }

    public static void main(String[] args) {
        String text =
                "Polymorphism is the ability of an object to take on many forms The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object Any Java object that can pass more than one IS-A test is considered to be polymorphic In Java all Java objects are polymorphic since any object will pass the IS-A test for their own type and for the class Object It is important to know that the only possible way to access an object is through a reference variable A reference variable can be of only one type Once declared the type of a reference variable cannot be changed The reference variable can be reassigned to other objects provided that it is not declared final The type of the reference variable would determine the methods that it can invoke on the object A reference variable can refer to any object of its declared type or any subtype of its declared type A reference variable can be declared as a class or interface type";

        text(text);

    }
}

