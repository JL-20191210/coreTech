package org.example.coreTech.LambdaDemo;

import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

public class userLambdaTest {
    @Test
    public void test1() {
        userLambdaDemo(() -> System.out.println("userLambda Test"));
    }

    public static void userLambdaDemo(userLambda ul){ul.run();}


    //语法格式一：无参，无返回值
    @Test
    public void test2(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("一般写法：无参，无返回值");
            }
        };
        runnable.run();

        System.out.println("*****************");

        Runnable runnable1 = ()-> System.out.println("lambda写法：语法格式一：无参，无返回值");
        runnable1.run();

    }

    //语法格式二：一个参数，无返回值
    @Test
    public void test3(){
        Consumer<String> stringConsumer = new Consumer<>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        stringConsumer.accept("一般方法：语法格式二：一个参数，无返回值");

        System.out.println("***************");
        Consumer<String> stringConsumer1 = (String s)-> System.out.println(s);
        stringConsumer1.accept("lambda表达式：语法格式二：一个参数，无返回值");
    }
    //语法格式三：数据类型可以省略，可以由编译器推断得出，称为类型推断
    @Test
    public void test4(){
        Consumer<String> stringConsumer1 = (String s)-> System.out.println(s);
        stringConsumer1.accept("lambda表达式：语法格式二：一个参数，无返回值");

        System.out.println("*********省略数据类型************");

        Consumer<String> stringConsumer2 = (s) -> System.out.println(s);
        stringConsumer2.accept("lambda表达式：语法格式二：一个参数，无返回值");
    }

    //语法格式四：只有一个参数，小括号可省略
    @Test
    public void test5(){
        Consumer<String> stringConsumer1 = (String s)-> System.out.println(s);
        stringConsumer1.accept("lambda表达式：语法格式二：一个参数，无返回值");

        System.out.println("*********省略小括号************");

        Consumer<String> stringConsumer2 = s -> System.out.println(s);
        stringConsumer2.accept("lambda表达式：语法格式二：一个参数，无返回值");
    }

    //语法格式五：两个及以上参数，含有多条语句，并且可以有返回值
    @Test
    public void test6(){
        Comparator<Integer> integerComparator = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return o1.compareTo(o2);
            }
        };
        System.out.println(integerComparator.compare(12,13));

        System.out.println("***************");
        Comparator<Integer> integerComparator1 = (o1,o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(o2);
        };

        System.out.println(integerComparator1.compare(13,12));
    }

    //语法格式六：当lambd体只有一条语句时，若有return和大括号，都可以省略
    @Test
    public void test7(){
        Comparator<Integer> integerComparator1 = (o1,o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(o2);
        };

        System.out.println(integerComparator1.compare(13,12));

        System.out.println("***************");

        Comparator<Integer> integerComparator2 = (o1,o2) -> o1.compareTo(o2);

        System.out.println(integerComparator2.compare(13,12));

    }


}

