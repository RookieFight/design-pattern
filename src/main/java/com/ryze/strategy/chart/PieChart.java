package com.ryze.strategy.chart;

/**
 * @author ryze
 * @date 2023-05-08 12:30
 */
public class PieChart extends Chart {

    @Override
    protected void handleData() {
        getData();
        System.out.println("饼图数据组装");
    }
}
