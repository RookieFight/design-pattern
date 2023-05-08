package com.ryze.strategy.chart;

/**
 * @author ryze
 * @date 2023-05-08 12:31
 */
public class MysqlPieChart extends PieChart{

    public MysqlPieChart(IDataSource dataSource) {
        this.dataSource = dataSource;
    }
}
