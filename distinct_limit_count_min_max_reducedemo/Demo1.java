package distinct_limit_count_min_max_reducedemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args){
        List<String> l = Arrays.asList("bus","car","car","bus","bike");

        List<String> disL= l.stream().distinct().collect(Collectors.toList());
        System.out.println(disL);

        Long len=l.stream().distinct().count();
        System.out.println(len);

        List<String> limL=l.stream().limit(2).collect(Collectors.toList());
        System.out.println(limL);


    }

}
