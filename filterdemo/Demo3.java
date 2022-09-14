package filterdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo3 {

    public static void main(String[] args){

        List<String> list = Arrays.asList("shanid",null,"jaza","aaban",null,"munnu","lulu");

        List<String> result = list.stream().filter(s -> s!=null).collect(Collectors.toList());
        System.out.println(result);

        list.stream().filter(s -> s!=null).forEach(s -> System.out.println(s));
        list.stream().filter(s -> s!=null).forEach(System.out::println);
    }
}
