package com.ryze.adaptor.classadaptor;

/**
 * @author ryze
 * @date 2023/5/7 20:30
 */
public class ClassAdaptor extends Voltage220 implements IVoltage5 {
    @Override
    public int output5() {
        int src = super.output220();
        int dst = src/44;
        return dst;
    }
}
