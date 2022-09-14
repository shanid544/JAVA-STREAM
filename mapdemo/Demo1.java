package mapdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args){

        List<String> list = Arrays.asList("bus","car","bicycle","flight","train");
        List<String> list1 = new ArrayList<>();

        list1 = list.stream().map(s -> s.toUpperCase(Locale.ROOT)).collect(Collectors.toList());
        System.out.println(list1);

        list.stream().map(s -> s.length()).forEach(m->System.out.println(m));
        list.stream().map(s -> s.length()).forEach(System.out::println);

    }
}
