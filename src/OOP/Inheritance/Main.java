package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal("Animal", 1, 1, 5, 5);
//        Dog dog = new Dog("York", 8, 20, 2, 4, 1, 20, "long silky");
//        dog.eat();
//        dog.walk();
//        dog.run();
//
//        Outlander outlander = new Outlander(36);
//        outlander.steer(45);
//        outlander.accelerate(30);
//        outlander.accelerate(20);
//        outlander.accelerate(-42);

        Circle circle = new Circle(3.75);
        System.out.println("Circle.radius= " + circle.getRadius());
        System.out.println("Circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("Cylinder.radius= " + cylinder.getRadius());
        System.out.println("Cylinder.height= " + cylinder.getHeight());
        System.out.println("Cylinder.area= " + cylinder.getArea());
        System.out.println("Cylinder.volume= " + cylinder.getVolume());
        //---------------------------------------------------------------------//

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle.width= " + rectangle.getWidth());
        System.out.println("Rectangle.length= " + rectangle.getLength());
        System.out.println("Rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("Cuboid.width= " + cuboid.getWidth());
        System.out.println("Cuboid.length= " + cuboid.getLength());
        System.out.println("Cuboid.area= " + cuboid.getArea());
        System.out.println("Cuboid.volume= " + cuboid.getVolume());
    }


}
