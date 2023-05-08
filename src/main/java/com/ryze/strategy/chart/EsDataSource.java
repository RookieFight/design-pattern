package com.ryze.strategy.chart;

/**
 * @author ryze
 * @date 2023-05-08 12:33
 */
public class EsDataSource implements IDataSource{
    @Override
    public void getData() {
        System.out.println("获取es数据源数据");
    }
}
