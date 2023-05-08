package com.ryze.adaptor.objadaptor;


/**
 * @author ryze
 * @date 2023/5/7 20:37
 *
 * 调用目标类方法
 */
public class Phone {

    public void  charge(IVoltage5 iVoltage5) {
        if (iVoltage5.output5() == 5) {
            System.out.println("刚刚好可以用");
        } else {
            System.out.println("不匹配用不了");
        }
    }
}
