/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author var1541b
 */
public class Fish extends Animals {

    String FishName;

    public void setNameDog(String newNameDog) {
        this.FishName = newNameDog;
    }

    public void showInfoFish() {
        System.out.println("\nХарактеристика рыбки:");
        System.out.println("Кличка: " + FishName);
        System.out.println("Размер: " + getSize());
        System.out.println("Размер: " + getWeight());
    }

    void FishRecessedApe() {
        System.out.println("Рыбка утопила обезьяну");
    }

    void FishDrisch() {
        System.out.println("Человек не поймал рыбку, т.к. он дрищ. "
                + "ХАХАХАХАХА и упал в воду");
    }
}
