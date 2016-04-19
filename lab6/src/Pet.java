/*
 Класс питомцы с полями: вес, пол, возраст
 */

/**
 *
 * @author var1541b
 */

public abstract class Pet {

    private int weight;
    private int age;
    private String sex;

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    //Метод для изменения значения свойства.
    public void setWeight(int newWeight) {
        weight = newWeight;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setSex(String newSex) {
        sex = newSex;
    }

    public abstract void showInfo();
}
