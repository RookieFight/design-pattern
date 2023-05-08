package com.ryze.strategy.chart;

/**
 * @author ryze
 * @date 2023-05-08 12:01
 */
public class LineChart extends Chart{

    @Override
    protected void handleData() {
        getData();
        System.out.println("折线图数据组装");
    }
}
