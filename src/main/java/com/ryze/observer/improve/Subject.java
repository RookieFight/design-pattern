package com.ryze.observer.improve;

/**
 * @author ryze
 * @date 2023/5/9 15:17
 *
 * 被观察者上层接口  管理观察者以及通知
 */
public interface Subject {
    /**
     * 注册观察者
     * @param o
     */
    public void registerObserver(Observer o);

    /**
     * 移除观察者
     * @param o
     */
    public void removeObserver(Observer o);

    /**
     * 通知
     */
    public void notifyObservers();
}
