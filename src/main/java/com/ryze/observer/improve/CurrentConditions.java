package com.ryze.observer.improve;

/**
 * @author ryze
 * @date 2023/5/9 14:49
 *
 * 气象站
 */
public class CurrentConditions implements Observer {

    private float temperature;
    private float pressure;
    private float humidity;


    /**
     * 更新天气信息   外部调用
     * @param temperature
     * @param pressure
     * @param humidity
     */
    public void update(float temperature,float pressure,float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    /**
     * 显示最新天气情况
     */
    public void display() {
        System.out.println("气象站temperature:"+temperature);
        System.out.println("气象站pressure:"+pressure);
        System.out.println("气象站humidity:"+humidity);
    }
}
