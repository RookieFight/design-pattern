package com.ryze.strategy.chart;

/**
 * @author ryze
 * @date 2023-05-08 12:34
 */
public class Client {
    public static void main(String[] args) {
        String dataSource = "mysql";
        String type = "line";
        Chart chart = null;
        if (type.equals("line")) {
            chart = new LineChart();
        } else if (type.equals("pie")) {
            chart = new PieChart();
        }
        switch (dataSource) {
            case "mysql":
                chart.setDataSource(new MySqlDataSource());
                break;
            case "es":
                chart.setDataSource(new EsDataSource());
                break;
        }
        chart.handleData();
    }
}
