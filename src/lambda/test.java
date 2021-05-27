package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class test{


    public static String better_string(String s1,String s2,BiPredicate<String,String>p){
        if(p.test(s1,s2))
            return s1;
        else
            return s2;

    }

}


