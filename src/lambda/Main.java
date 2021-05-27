package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class Main {

    public static void main(String[] args) {

        String string1="string";
        String string2="better string";
        String longer= test.better_string(string1,string2,(s1,s2)->s1.length()>s2.length());
        String first=test.better_string(string1,string2,(s1,s2)->true);
        System.out.println(longer);
        System.out.println(first);


        }

    }

