package com.ryze.principle.ocp.improve;

/**
 * 开闭原则：对拓展开放，对修改关闭，用抽象构建框架，用实现扩展细节
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drowShape(new Rectangle());
        graphicEditor.drowShape(new Circle());
    }
}


class GraphicEditor {
    public void drowShape(Shape s) {
        s.draw();
    }
}

/**
 * 在基类添加抽象方法让子类自己实现，当需要拓展时，只需要增加实现类，调用方不需要修改代码
 */
abstract class Shape {
    public abstract void draw();
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("画矩形");
    }
}

class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("画圆");
    }
}

