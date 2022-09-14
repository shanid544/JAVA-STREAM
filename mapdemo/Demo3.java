package mapdemo;

import java.net.PortUnreachableException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class Employee{
    int id;
    String name;
    int salary;
    Employee(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
}
public class Demo3 {
    public static void main(String[] args){

        List<Employee> list = Arrays.asList(
                new Employee(1,"shanid",10000),
                new Employee(2,"aaban",20000),
                new Employee(3,"thanveer",30000),
                new Employee(4,"jaza",40000),
                new Employee(5,"lulu",50000)
        );
        List<Integer> list1 = new ArrayList<>();

        list1=list.stream()
                .filter(employee -> employee.salary>20000)
                .map(employee -> employee.salary)
                .collect(Collectors.toList());
        System.out.println(list1);
    }
}
