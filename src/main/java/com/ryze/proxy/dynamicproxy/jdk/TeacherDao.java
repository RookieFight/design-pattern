package com.ryze.proxy.dynamicproxy.jdk;

/**
 * @author ryze
 * @date 2023/5/9 10:44
 */
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("老师上课");
    }
}
