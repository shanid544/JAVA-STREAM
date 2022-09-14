package filterdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

    public static void main(String[] args){

       /* ArrayList<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(13);
        list.add(15);
        list.add(24);
        list.add(29);
        list.add(1);
        list.add(12);*/
        List<Integer> list = Arrays.asList(14,13,15,24,29,1,12);
        List<Integer> evenList = new ArrayList<>();


        //without stream
        for (int n:list
             ) {
            if(n%2==0){
                evenList.add(n);
            }
        }
        System.out.println("from traditional "+evenList);

        //with stream
        evenList = list.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println("from stream "+evenList);

        //direct printing from stream without collecting to another list
        list.stream().filter(n->n%2==0)
                .forEach(n->System.out.println(n));

        list.stream().filter(n->n%2==0).forEach(System.out::println);

    }

}
