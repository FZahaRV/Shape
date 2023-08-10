package org.example;

class Shape{
    public void printName(String name){
        System.out.println(name);
    }
}
class Quad extends Shape{
    private final String name = "Quad";
    public String getName(){
        return name;
    }
}
class Circle extends Shape{
    private final String name = "Circle";
    public String getName(){
        return name;
    }
}
class Triangle extends Shape{
    private final String name = "Triangle";
    public String getName(){
        return name;
    }
}
class Rectangle extends Shape{
    private final String name = "Rectangle";

    public String getName(){
        return name;
    }
}
class Octagon extends Shape{
    private final String name = "Octagon";

    public String getName(){
        return name;
    }
}
class ShapeTest{
    public static void main(String[] args){
        Quad quad = new Quad();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Octagon octagon = new Octagon();
        octagon.printName(quad.getName());
        octagon.printName(circle.getName());
        octagon.printName(triangle.getName());
        octagon.printName(rectangle.getName());
        octagon.printName(octagon.getName());
    }
}