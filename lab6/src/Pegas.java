/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author var1541b
 */
class Pegas extends Horse {

    public Pegas(String str) {
        super(str);
    }

    void fly() {
        System.out.print("Летит лошадь с именем: " + this.Name());
    }
}
