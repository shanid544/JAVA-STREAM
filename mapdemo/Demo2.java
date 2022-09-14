package mapdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4);
        List<Integer> list1 = new ArrayList<>();

        list1=list.stream().map(n->n*3).collect(Collectors.toList());
        System.out.println(list1);
        list.stream().map(n->n*3).forEach(System.out::println);

    }
}
