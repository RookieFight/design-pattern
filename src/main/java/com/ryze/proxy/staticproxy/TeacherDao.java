package com.ryze.proxy.staticproxy;

/**
 * @author ryze
 * @date 2023/5/9 10:34
 *
 * 目标对象
 */
public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("目标对象在上课");
    }
}
