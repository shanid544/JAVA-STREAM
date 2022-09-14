package flatmapdemo;

import java.util.Arrays;
import java.util.List;

public class Demo2 {

    public static void main(String[] args){
        List<String> t1 = Arrays.asList("shanid","safer","aslam");
        List<String> t2 = Arrays.asList("irshad","arhem","murshid");
        List<String> t3 = Arrays.asList("nisam","jaseel","faiz");

        List<List<String>> t = Arrays.asList(t1,t2,t3);

        t.stream().flatMap(x->x.stream()).forEach(System.out::println);

    }
}
