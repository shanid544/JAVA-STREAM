package flatmapdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        List<Integer> list1 =list.stream().map(n->n+10).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(list1);

        List<Integer> l1 = Arrays.asList(1,2);
        List<Integer> l2 = Arrays.asList(3,4);
        List<Integer> l3 = Arrays.asList(5,6);

        List<List<Integer>> l = Arrays.asList(l1,l2,l3);
        System.out.println(l);

        List<Integer> lFinal= l.stream().flatMap(o->o.stream()).collect(Collectors.toList());
        System.out.println(lFinal);

        List<Integer> lFinal1= l.stream().flatMap(o->o.stream().map(n->n+10)).collect(Collectors.toList());
        System.out.println(lFinal1);



    }
}
