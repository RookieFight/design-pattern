package com.ryze.strategy.chart;

/**
 * @author ryze
 * @date 2023-05-08 11:57
 *
 * 图表基类
 */
public abstract class Chart {

    IDataSource dataSource;

    protected void setDataSource(IDataSource dataSource) {
        this.dataSource = dataSource;
    }

    protected void getData() {
        dataSource.getData();
    }

    protected abstract void handleData();
}
