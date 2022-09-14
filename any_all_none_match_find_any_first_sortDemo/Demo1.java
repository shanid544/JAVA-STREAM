package any_all_none_match_find_any_first_sortDemo;

import java.net.PortUnreachableException;
import java.util.*;
import java.util.stream.Collectors;

public class Demo1 {

    public static void main(String[] args){

        //sorted()
        //ascending order
        List<Integer> l = Arrays.asList(4,2,6,9,1,3,8,2,6,0,5);
        List<Integer> sortedL= l.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedL);

        //sorted
        //descending order
        sortedL=l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedL);

        //String
        //sorted()
        //ascending order
        List<String> sl = Arrays.asList("john","mary","kim","david","smith");
        List<String> sortedSl=sl.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedSl);

        //String
        //sorted()
        //descending order
        sortedSl=sl.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedSl);

        Set<String> fru = new HashSet<>();
        fru.add("One apple");
        fru.add("One mango");
        fru.add("Two apple");
        fru.add("More grapes");
        fru.add("Two guavas");

        boolean any=fru.stream().anyMatch(s -> s.startsWith("One"));
        System.out.println(any);

        boolean all=fru.stream().allMatch(s -> s.startsWith("One"));
        System.out.println(all);

        boolean none=fru.stream().noneMatch(s -> s.startsWith("Two"));
        System.out.println(none);

        Optional<String> fAny=fru.stream().findAny();
        System.out.println(fAny.get());

        Optional<String> fFirst=fru.stream().findFirst();
        System.out.println(fFirst.get());
       // System.out.println(any);
    }
}
