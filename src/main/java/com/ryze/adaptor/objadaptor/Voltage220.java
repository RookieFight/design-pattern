package com.ryze.adaptor.objadaptor;

/**
 * @author ryze
 * @date 2023/5/7 20:29
 *
 * 被适配类
 */
public class Voltage220 {

    public int output220() {
        int src = 220;
        System.out.println("输出220v");
        return src;
    }
}
