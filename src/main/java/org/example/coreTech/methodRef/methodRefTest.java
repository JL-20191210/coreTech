package org.example.coreTech.methodRef;

import org.junit.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class methodRefTest {
    //情况一：对象：：实例方法
    //consumer的void accept（T t）
    //PrintStream的void println(T t)
    @Test
    public void test1(){
        Consumer<String> con = str-> System.out.println(str);
        con.accept("这是lambda表达式形式的输出");

        PrintStream ps = System.out;
        Consumer<String> con2 = ps::println;
        con2.accept("这是方法应用形式的输出");
    }

    //supplier中的T get()
    //Employee中的 String getname()
    @Test
    public void test2(){
        Employee employee = new Employee(001, "jerry", "男", 2000);
        Supplier<String> sup = ()->employee.getName();
        System.out.println(sup.get());

        //引用 对象：：实例方法
        Supplier<String> sup1 = employee::getName;
        System.out.println(sup1.get());
    }

    //情况二：类：：静态方法
    //comparator中的int compare(T t1,T t2)
    //integer中的int compare(T t1,T t2)
    @Test
    public void test3(){
        Comparator<Integer> comp = (t1,t2)->Integer.compare(t1,t2);
        System.out.println("lambda表达式方式的比较"+comp.compare(12,13) );

        Comparator<Integer> comp2 = Integer::compare;
        System.out.println("方法引用方式的比较"+comp2.compare(12,13));
    }

    //function中的R apply(T t) Function<Double,Long> 参数为Double，返回值为Long
    //Math中的Long round（Double d）
    @Test
    public void test4(){
        Function<Double,Long> fuc = n->Math.round(n);
        System.out.println(fuc.apply(12.6));

        Function<Double,Long> fuc1 = Math::round;
        System.out.println(fuc1.apply(13.2));
    }

    //情况三：类：：实例方法(非静态方法)
    //comparator中的int compate(T t1,T t2)
    //String中的int t1.compare(t2)
    @Test
    public void test5(){
        Comparator<String> comp = (t1,t2)->t1.compareTo(t2);
        System.out.println(comp.compare("abv","abz"));

        Comparator<String> comp2 = String::compareTo;
        System.out.println(comp2.compare("abc","abz"));
    }

    //function中的R apply（T t）
    //Employee中的String getname()
    @Test
    public void test6(){
        Employee emp = new Employee(002,"tom","男",9000);
        Function<Employee,String> func = e->e.getName();
        System.out.println(func.apply(emp));
        //引用 类：：实例方法
        Function<Employee,String> func2 = Employee::getName;
        System.out.println(func2.apply(emp));
    }
}
