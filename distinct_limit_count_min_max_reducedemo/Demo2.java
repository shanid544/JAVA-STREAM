package distinct_limit_count_min_max_reducedemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Demo2 {

    public static void main(String[] args){

        List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        long lenEven = l.stream().filter(n->n%2==0).count();
        System.out.println(lenEven);

        OptionalDouble d=l.stream().mapToInt(n->n.intValue()).average();
        System.out.println(d);

        //min()
        Optional<Integer> min= l.stream().min((v1, v2)-> {return v1.compareTo(v2);});
        System.out.println(min);
        System.out.println(min.get());

        //max()
        Optional<Integer> max = l.stream().max((v1,v2)->{return v1.compareTo(v2);});
        System.out.println(max);
        System.out.println(max.get());


    }
}
