package com.ryze.adaptor.objadaptor;

/**
 * @author ryze
 * @date 2023/5/7 20:51
 *
 * 对象适配器  聚合src类实例实现dst接口
 */
public class ObjAdaptor implements IVoltage5 {

    private Voltage220 voltage220;

    public ObjAdaptor(Voltage220 voltage220) {
        this.voltage220 = voltage220;
    }

    @Override
    public int output5() {
        int src = voltage220.output220();
        int dst = src/44;
        return dst;
    }
}
