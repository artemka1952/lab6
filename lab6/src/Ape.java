/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author var1541b
 */
class Ape extends Animals {

    void showInfoApe() {
        System.out.println("\nХарактеристики обезьяны:");
        System.out.println("Вес составляет:" + getWeight());
        System.out.println("IQ мозга равен:" + getSize());
    }

    void ApeCaughtFish() {
        System.out.println("Обезьяна поймала рыбку, но так как она ее не любит, то он отдал ее братишке");
    }

    void ApeCatchesHuman() {
        System.out.println("Обезьяна глумится над человеком, потому что она с*ка большая");
    }
}
