package parallelsreamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{

    String name;
    int mark;

    Student(String n,int m){
        name=n;
        mark=m;
    }
}

public class Demo1 {

    public static void main(String[] args){

        List<Student> students = Arrays.asList(

                new Student("shanid",90),
                new Student("shani",96),
                new Student("shan",45),
                new Student("sha",87),
                new Student("shaa",70)

        );

        //using stream
        students.stream().filter(student -> student.mark>80)
                .limit(2)
                .forEach(student -> System.out.println(student.name+" "+student.mark));

        //using parallel stream
        students.parallelStream().filter(student -> student.mark>80)
                .limit(2)
                .forEach(student -> System.out.println(student.name+" "+student.mark));

        //convert stream into parallel stream
        students.stream().parallel().filter(student -> student.mark>80)
                .limit(2)
                .forEach(student -> System.out.println(student.name+" "+student.mark));
    }
}
