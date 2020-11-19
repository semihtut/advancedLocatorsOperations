package Utilities;

import com.github.javafaker.Faker;

public class StringNameGenerator {

    public static String bookName() {
        Faker faker = new Faker();
        return faker.book().title();
    }



}
