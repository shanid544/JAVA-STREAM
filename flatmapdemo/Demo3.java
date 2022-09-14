package flatmapdemo;


import java.util.Arrays;
import java.util.List;

class Student{
    String name;
    int id;
    char grade;

    Student(String n,int i,char g){
        name=n;
        id=i;
        grade=g;
    }
}
public class Demo3 {

    public static void main(String[] args){
        List<Student> s1 = Arrays.asList(
                new Student("shanid",1,'A'),
                new Student("minnu",1,'B'),
                new Student("jaxza",1,'A'),
                new Student("haffi",1,'C'),
                new Student("miyas",1,'D')
        );
        List<Student> s2 = Arrays.asList(
                new Student("shan",1,'D'),
                new Student("min",1,'F'),
                new Student("jaa",1,'C'),
                new Student("hffi",1,'C'),
                new Student("mis",1,'A')
        );

        List<List<Student>> s= Arrays.asList(s1,s2);

        //before java 8
        for (List<Student> ls: s) {
            for (Student st: ls) {
                System.out.println(st.name);
            }
        }

        //after java 8
        s.stream().flatMap(stuL->stuL.stream().map(st->st.name)).forEach(System.out::println);


    }
}
