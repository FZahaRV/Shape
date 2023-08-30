package org.example;

abstract class Shape{
    abstract void printName();
}
class Quad extends Shape{
    public String name = "Quad";
    @Override
    void printName() {
        System.out.println(name);
    }
}
class Circle extends Shape{
    public String name = "Circle";
    @Override
    void printName() {
        System.out.println(name);
    }
}
class Triangle extends Shape{
    public String name = "Triangle";
    @Override
    void printName() {
        System.out.println(name);
    }
}
class Rectangle extends Shape{
    public String name = "Rectangle";
    @Override
    void printName() {
        System.out.println(name);
    }
}
class Octagon extends Shape{
    public String name = "Octagon";

    @Override
    void printName() {
        System.out.println(name);
    }
}
class ShapePrinter {
    public void printName(Shape shape) {
        shape.printName();
    }
}
class ShapeTest{
    public static void main(String[] args){
        Quad quad = new Quad();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Octagon octagon = new Octagon();
        new ShapePrinter().printName(quad);
        new ShapePrinter().printName(circle);
        new ShapePrinter().printName(triangle);
        new ShapePrinter().printName(rectangle);
        new ShapePrinter().printName(octagon);
    }
}