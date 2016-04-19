
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author var1541b
 */
public class Test2 {

    public static void main(String[] args) {
        int x, y, x1, y1;
        String s, s1, name_cat, name_dog;

        try {
            System.out.print("Введите кличку кота: ");
            Scanner sc_namec = new Scanner(System.in);
            name_cat = sc_namec.next();
            for (int i = 0; i < 10; i++) {
                if (name_cat.contains("" + i)) {
                    System.out.println("Ошибка! Слово содержит число! \n");
                    return;
                }
            }

            System.out.print("Введите вес кота: ");
            Scanner sc_x = new Scanner(System.in);
            x = sc_x.nextInt();
            if (x < 10) {
                System.out.println("Кошка дрищ");
                return;
            }

            System.out.print("Введите возраст кота: ");
            Scanner sc_y = new Scanner(System.in);
            y = sc_y.nextInt();
            if (y < 1) {
                System.out.println("Лялька");
                return;
            }

            System.out.print("Введите пол кота (m/w): ");
            Scanner sc_s = new Scanner(System.in);
            s = sc_s.next();
            for (int i = 0; i < 10; i++) {
                if (s.contains("" + i)) {
                    System.out.println("Ошибка! Слово содержит число! \n");
                    return;
                }
            }

            System.out.print("Введите кличку собаки: ");
            Scanner sc_named = new Scanner(System.in);
            name_dog = sc_named.next();
            for (int i = 0; i < 10; i++) {
                if (name_dog.contains("" + i)) {
                    System.out.println("Ошибка! Слово содержит число! \n");
                    return;
                }
            }

            System.out.print("Введите вес собаки: ");
            Scanner sc_x1 = new Scanner(System.in);
            x1 = sc_x1.nextInt();
            if (x1 < 10) {
                System.out.println("Покорми собаку");
                return;
            }

            System.out.print("Введите возраст собаки: ");
            Scanner sc_y1 = new Scanner(System.in);
            y1 = sc_y1.nextInt();
            if (y1 < 1) {
                System.out.println("Малявка");
                return;
            }

            System.out.print("Введите пол собаки (m/w): ");
            Scanner sc_s1 = new Scanner(System.in);
            s1 = sc_s1.next();
            for (int i = 0; i < 10; i++) {
                if (s1.contains("" + i)) {
                    System.out.println("Ошибка! Слово содержит число! \n");
                    return;
                }
            }

            Cat cat1 = new Cat();
            Dog dog1 = new Dog();

            //Для объекта вызываем метод изменения значения свойства.
            //кошка
            cat1.setNameCat(name_cat);
            cat1.setWeight(x);
            cat1.setAge(y);
            cat1.setSex(s);
            cat1.showInfo();

            //собака
            dog1.setNameDog(name_dog);
            dog1.setWeight(x1);
            dog1.setAge(y1);
            dog1.setSex(s1);
            dog1.showInfo();

        } catch (Exception e) {
            System.out.println("Ошибка! Вы ввели символ!");
        }
    }
}
