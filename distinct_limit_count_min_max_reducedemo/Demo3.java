package distinct_limit_count_min_max_reducedemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo3 {

    public static void main(String[] args) {

        List<String> l = Arrays.asList("A","B","C","1","2","3");
        Optional<String> s=l.stream().reduce((value, combinedValue)->
        {
           return combinedValue+value;
        });
        System.out.println(s);
        System.out.println(s.get());

    }
}
