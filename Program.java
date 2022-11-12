import java.util.Scanner;
import java.util.ArrayList;
import java.io;

class JThread extends Thread {

    JThread(String name) {
        super(name);
    }

    public void run() {

        System.out.printf("%s started... \n", Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.printf("%s fiished... \n", Thread.currentThread().getName());
    }
}

public class Program {
    public static void main(String[] args) {

        Scanner an = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = an.nextInt();

        System.out.printf("Your number: " + num);
        System.out.println();
        System.out.print("Collection: ");
        System.out.println();
        collect();
        System.out.println();

        int qq = 8;
        switch (qq) {

            case 1:
                System.out.println("число равно 1");
                break;
            case 8:
                System.out.println("число равно 8");
                num++;
                break;
            case 9:
                System.out.println("число равно 9");
                break;
            default:
                System.out.println("число не равно 1, 8, 9");
        }
        String str = "Hello world";
        String substr1 = str.substring(6); // world
        String substr2 = str.substring(3, 5); // lo
        System.out.println(substr1);
        System.out.println(substr2);

        Thread t = Thread.currentThread(); // получаем главный поток
        System.out.println(t); // main
        // поток
        System.out.println("Main thread started...");
        new JThread("JThread").start();
        System.out.println("Main thread finished...");
    }

    public static void collect() {
        ArrayList<String> people = new ArrayList<String>();
        // добавим в список ряд элементов
        people.add("Tom");
        people.add("Alice");
        people.add("Kate");
        people.add("Sam");
        people.add(1, "Bob"); // добавляем элемент по индексу 1

        System.out.println(people.get(1));// получаем 2-й объект
        people.set(1, "Robert"); // установка нового значения для 2-го объекта

        System.out.printf("ArrayList has %d elements \n", people.size());
        for (String person : people) {

            System.out.println(person);
        }
        // проверяем наличие элемента
        if (people.contains("Tom")) {

            System.out.println("ArrayList contains Tom");
        }

        // удалим несколько объектов
        // удаление конкретного элемента
        people.remove("Robert");
        // удаление по индексу
        people.remove(0);

        Object[] peopleArray = people.toArray();
        for (Object person : peopleArray) {

            System.out.println(person);
        }
    }

}
