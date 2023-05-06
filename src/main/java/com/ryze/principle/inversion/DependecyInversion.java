package com.ryze.principle.inversion;

/**
 * 依赖倒转原则：抽象不应该依赖细节，细节应该依赖于抽象
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

/**
 * 完成person消息接收功能
 * 方式一
 * 简单易理解，不易拓展，当邮件对象换成其他方式时需要增加相应类，并且person类也需要增加相应方法
 *
 * 解决方法：引入接口IReceiver表示接收者，Person依赖于接口
 */
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}

class Email{
    public String getInfo() {
        return "发送电子邮件：hello world";
    }
}