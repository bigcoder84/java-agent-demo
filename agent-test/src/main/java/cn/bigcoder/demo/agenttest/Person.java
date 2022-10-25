package cn.bigcoder.demo.agenttest;

import java.util.Random;

public class Person {
   public String test() {
       System.out.println("执行测试方法");
       try {
           Thread.sleep(new Random().nextInt(1000));
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
       return "I'm ok";
  }
}