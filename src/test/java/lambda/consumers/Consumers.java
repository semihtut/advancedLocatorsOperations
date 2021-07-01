package lambda.consumers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Consumers {

    public static void main(String[] args) {

        List<String>myList = Arrays.asList("semih","tut");

        myList.forEach(s-> System.out.println(s.toUpperCase()));
    }
}
