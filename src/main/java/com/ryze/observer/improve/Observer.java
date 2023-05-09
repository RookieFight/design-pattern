package com.ryze.observer.improve;

/**
 * @author ryze
 * @date 2023/5/9 15:22
 *
 * 观察者上层接口
 */
public interface Observer {

    public void update(float temperature,float pressure,float humidity);
}
