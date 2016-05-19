/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author var1541b
 */
public class Test3 {

    static private int power;
    static int check_fish;
    static boolean edibility;

    public int getPower() {
        return power;
    }

    public static void main(String[] args) {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Человек");
        Human human = new Human();

        System.out.println("Обезьяна");
        Ape ape = new Ape();

        System.out.println("Рыба");
        Fish fish = new Fish();

        human.hunting(ape);
        ape.fishing(fish);
    }
}
