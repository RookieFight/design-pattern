package com.ryze.observer.improve;

/**
 * @author ryze
 * @date 2023/5/9 15:35
 */
public class Client {

    public static void main(String[] args) {
        //创建被观察者
        WeatherData weatherData = new WeatherData();
        //创建观察者
        CurrentConditions currentConditions = new CurrentConditions();
        //将观察者注册到被观察者中
        weatherData.registerObserver(currentConditions);
        weatherData.setData(11,231,55);

        //添加观察者
        weatherData.registerObserver(new Weibo());
        weatherData.setData(33,522,26);

    }
}
