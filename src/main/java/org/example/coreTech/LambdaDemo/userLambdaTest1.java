package org.example.coreTech.LambdaDemo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class userLambdaTest1 {

    //消费型
    @Test
    public void test1(){
        consume(400, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("消费了"+aDouble);
            }
        });

        System.out.println("*************");

        consume(600,money -> System.out.println("消费了"+money));

    }
    public void consume(double money,Consumer<Double> con){
        con.accept(money);
    }
    //断定型：根据给定的规则，过滤集合中的字符串，此规则由predicate的方法决定
    @Test
    public void test2(){
        List<String> list = Arrays.asList("北京", "南京", "东京", "西京", "天津");
        List<String> jing = filterString(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("京");
            }
        });

        System.out.println(jing);
        System.out.println("***********");
        List<String> jing1 = filterString(list,s->s.contains("北"));
        System.out.println(jing1);

    }

    public List<String> filterString(List<String> list, Predicate<String> pre){
        ArrayList<String> strings = new ArrayList<>();
        for (String s:list) {
            if(pre.test(s)) strings.add(s);
        }
        return strings;
    }
}
