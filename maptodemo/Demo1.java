package maptodemo;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Demo1 {

    public static void main(String[] args){

        List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,10);


        OptionalDouble d=l.stream().mapToInt(n->n.intValue()).average();
        System.out.println(d);

        Object[] obj=l.stream().toArray();
        System.out.println(obj[0]);

        Stream s1 = l.stream().skip(3);
        s1.forEach(System.out::println);

        l.stream().peek(s->System.out.println(s));
        l.stream().peek(s->System.out.println(s)).count();

        Stream s2=Stream.of("shanid","shan");
        s2.forEach(System.out::println);

        //stream class is not completed

    }

}
