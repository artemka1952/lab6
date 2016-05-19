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

    public Human() {
    }

    public void hunting(Ape ape) {
        if (this.getPower() > ape.getPower()) {
            System.out.println("Человечек принес домой дичь. Бедная обезьянка +_+\n");
        } else {
            System.out.println("Человечка выгнали из дома(он не принес добычу)\n");
        }

    }
}
