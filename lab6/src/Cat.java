/*
 * Описание класса Кошка
 */

/**
 * @author var1541b
 */
public class Cat extends Pet {

    private String nameCat;

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String newNameCat) {
        this.nameCat = newNameCat;
    }
// Вывод полной информации о животном 

    @Override
    public void showInfo() {
        System.out.println("\n Характеристика кота:");
        System.out.println("Имя:" + getNameCat());
        System.out.println("Вес:" + getWeight());
        System.out.println("Возраст:" + getAge());
        System.out.println("Пол:" + getSex());
    }
}
