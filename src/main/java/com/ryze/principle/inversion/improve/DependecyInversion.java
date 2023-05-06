package com.ryze.principle.inversion.improve;

public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeChat());
    }
}

interface IReceiver {
    public String getInfo();
}

/**
 *
 * 方式二
 * 类依赖于接口，不依赖于具体的实现类，易于拓展，且客户端无感知
 *
 */
class Person {
    public void receive(IReceiver iReceiver) {
        System.out.println(iReceiver.getInfo());
    }
}

class WeChat implements IReceiver {

    @Override
    public String getInfo() {
        return "发送微信：hello wechat";
    }
}

class Email implements IReceiver {
    @Override
    public String getInfo() {
        return "发送电子邮件：hello world";
    }
}