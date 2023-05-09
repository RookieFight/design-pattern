package com.ryze.observer;

/**
 * @author ryze
 * @date 2023/5/9 15:03
 *
 *
 * 传统方法实现天气推送    缺点时每次添加被通知方需要修改代码聚合新的通知方  违反了ocp原则
 */
public class Client {
    public static void main(String[] args) {
        //创建接入方
        CurrentConditions currentConditions = new CurrentConditions();
        WeatherData weatherData = new WeatherData(currentConditions);
        weatherData.setData(31,22,51);
        System.out.println("===================");
        //变化后
        weatherData.setData(22,111,36);
    }

}
