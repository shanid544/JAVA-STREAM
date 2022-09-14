package filterdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product{
     int id;
     String name;
     int price;

     Product(int id, String name, int price){
         this.id=id;
         this.name=name;
         this.price=price;
     }
}


public class Demo4 {

    public static void main(String[] args ){

        List<Product> list = Arrays.asList(
                new Product(1,"HP Laptop",250000),
                new Product(2,"Dell Laptop",300000),
                new Product(3,"Lenova Laptop",280000),
                new Product(4,"Sony Laptop",230000),
                new Product(1,"Apple Laptop",900000)
        );
        list.stream()
                .filter(product -> product.price>250000)
                .forEach(product -> System.out.println(product.price));
    }
}

