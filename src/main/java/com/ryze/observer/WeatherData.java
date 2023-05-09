package com.ryze.observer;

import lombok.Data;

/**
 * @author ryze
 * @date 2023/5/9 14:58
 *
 * 包含最新的天气信息  当有数据更新时主动调用CurrentConditions#update方法进行推送
 */
@Data
public class WeatherData {
    private float temperature;
    private float pressure;
    private float humidity;
    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    /**
     * 数据更新时调用当前方法更新
     * @param temperature
     * @param pressure
     * @param humidity
     */
    public void setData(float temperature,float pressure,float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    public void dataChange() {
        currentConditions.update(getTemperature(),getPressure(),getHumidity());
    }

}
