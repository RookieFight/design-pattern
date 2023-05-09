package com.ryze.observer.improve;

/**
 * @author ryze
 * @date 2023/5/9 15:45
 *
 * 微博天气
 */
public class Weibo implements Observer{

    private float temperature;
    private float pressure;
    private float humidity;


    /**
     * 显示最新天气情况
     */
    public void display() {
        System.out.println("微博天气temperature:"+temperature);
        System.out.println("微博天气pressure:"+pressure);
        System.out.println("微博天气humidity:"+humidity);
    }
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
}
