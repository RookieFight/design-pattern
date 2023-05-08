package com.ryze.strategy.chart;

/**
 * @author ryze
 * @date 2023-05-08 12:28
 */
public class MySqlLineChart extends LineChart{

    public MySqlLineChart(IDataSource dataSource) {
        this.dataSource = dataSource;
    }
}
