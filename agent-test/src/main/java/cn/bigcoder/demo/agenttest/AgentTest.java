package cn.bigcoder.demo.agenttest;

import java.util.Scanner;

/**
 * @author: Jindong.Tian
 * @date: 2022-10-24
 **/
public class AgentTest {

    public static void main(String[] args) {
        System.out.println("按数字键 1 调用测试方法");
        while (true) {
            Scanner reader = new Scanner(System.in);
            int number = reader.nextInt();
            if (number == 1) {
                Person person = new Person();
                person.test();
            }
        }
    }

}
