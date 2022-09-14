package sream_concate_demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args){

        List<String> animalList= Arrays.asList("Dog","Cat","Rat");
        List<String> birdList=Arrays.asList("hen","cock","Crow");

        Stream<String> s1=animalList.stream();
        Stream<String> s2=birdList.stream();



        List<String> finalList = Stream.concat(s1,s2).collect(Collectors.toList());

        finalList.stream().forEach(s->System.out.println(s));
        for (String s:finalList
             ) {
            System.out.println(s);
        }

    }
}
