package com.ryze.observer.improve;

import lombok.Data;

import java.util.ArrayList;

/**
 * @author ryze
 * @date 2023/5/9 14:58
 * <p>
 * 聚合观察者集合  使用list管理  当有数据更新时通知集合中的观察者
 */
@Data
public class WeatherData implements Subject {
    private float temperature;
    private float pressure;
    private float humidity;
    private ArrayList<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    /**
     * 数据更新时调用当前方法更新
     *
     * @param temperature
     * @param pressure
     * @param humidity
     */
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    public void dataChange() {
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (observers.contains(o)) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.temperature,this.pressure,this.humidity);
        }
    }
}
