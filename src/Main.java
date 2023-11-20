import Developer.HRManager;
import Developer.JuniorDeveloper;
import Developer.MidDeveloper;
import Developer.SeniorDeveloper;
import PoolPackage.Cuboid;
import PoolPackage.Rectangle;
import inheritance.Circle;
import inheritance.Cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());

        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());

        System.out.println("cylinder.height= " + cylinder.getHeight());

        System.out.println("cylinder.area= " + cylinder.getArea());

        System.out.println("cylinder.volume= " + cylinder.getVolume());
        System.out.println("****************************************");
        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());
        System.out.println("****************************************");
        JuniorDeveloper junior1 = new JuniorDeveloper(1, "Mehmet Ali");
        JuniorDeveloper junior2 = new JuniorDeveloper(2, "Gulbeyaz");
        junior1.work();
        junior2.work();
        System.out.println(junior1);
        System.out.println(junior2);

        MidDeveloper mid1 = new MidDeveloper(3, "Ahmet");
        MidDeveloper mid2 = new MidDeveloper(4, "Emra");
        mid1.work();
        mid2.work();
        System.out.println(mid1);
        System.out.println(mid2);

        SeniorDeveloper senior1 = new SeniorDeveloper(5, "Mustafa");
        senior1.work();
        System.out.println(senior1);
        System.out.println("****************************************");
        HRManager hrManager = new HRManager(6, "Dogancan",
                new JuniorDeveloper[5], new MidDeveloper[2], new SeniorDeveloper[1]);
        hrManager.work();
        hrManager.addEmployee(0, junior1);
        hrManager.addEmployee(1, junior2);
        hrManager.addEmployee(0, mid1);
        hrManager.addEmployee(1, mid2);
        hrManager.addEmployee(0, senior1);
        System.out.println(hrManager);

    }
}