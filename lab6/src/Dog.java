/*
 * Описание класса Песик
 */

/**
 *
 * @author var1541b
 */
public class Dog extends Pet {

    String nameDog;

    public void setNameDog(String newNameDog) {
        this.nameDog = newNameDog;
    }

    public void showInfo() {
        System.out.println("\nХарактеристика собаки:");
        System.out.println("Кличка: " + nameDog);
        System.out.println("Вес: " + getWeight());
        System.out.println("Возраст: " + getAge());
        System.out.println("Пол:" + getSex());
    }
}
