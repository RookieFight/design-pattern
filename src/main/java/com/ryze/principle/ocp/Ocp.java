package com.ryze.principle.ocp;

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

/**
 * 当再次增加图形绘制时，不光提供方需要修改代码，调用方也同样需要修改代码，违反了开闭原则
 */
class GraphicEditor {
    public void drowShape(Shape s) {
        if (s.type == 1) {
            drawRectangle(s);
        } else if (s.type == 2) {
            drawCircle(s);
        }
    }

    private void drawCircle(Shape s) {
        System.out.println("画圆");
    }

    private void drawRectangle(Shape s) {
        System.out.println("画矩形");
    }
}

class Shape {
    int type;
}

class Rectangle extends Shape {
    public Rectangle() {
        type = 1;
    }
}

class Circle extends Shape {
    public Circle() {
        type = 2;
    }
}

