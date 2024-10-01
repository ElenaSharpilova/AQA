import hw1.Car;
import hw1.Clock;
import hw1.Point;
import hw1.Student;


public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setNameStudent("Garry Smith");
        student1.setGradeBook("123FDS");
        student1.setMark(0.9);
        student1.print();

        Point point = new Point();
        point.setX(4);
        point.setY(8);
        point.displayPosition();

        point.moveUp();
        point.moveRight();
        point.displayPosition();

        point.moveLeft();
        point.moveDown();
        point.displayPosition();

        Clock clock = new Clock(23, 59, 58);
        clock.readTime(); // Текущие часы: 23:59:58

        clock.tick(); // Увеличение времени на одну секунду
        clock.readTime(); // Текущие часы: 23:59:59

        clock.tick(); // Еще одно увеличение времени
        clock.readTime(); // Текущие часы: 00:00:00

        Car car1 = new Car("BMW", "X7", 2023);
        car1.setBrand("Honda");
        car1.setModel("Accord");
        car1.setYear(2000);

        System.out.println("Марка: " + car1.getBrand());
        System.out.println("Модель: " + car1.getModel());
        System.out.println("Год: " + car1.getYear());

        car1.start();
        car1.drive(400);
        car1.stop();
        }
}
