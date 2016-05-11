/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author var1541b
 */
class Human extends Ape {

    void showInfoMan() {
        System.out.println("\nХарактеристики человека:");
        System.out.println("Вес составляет:" + getWeight());
        System.out.println("IQ мозга равен:" + getSize() + "\n");
    }

    void HumanCauchesApe() {
        System.out.println("Человек поймал обезьяну и посадил в клетку");
    }

    void HumanCauchesFish() {
        System.out.println("Наш дрищ поймал рыбеху. Кто-то сварит нам уху");
    }
}
