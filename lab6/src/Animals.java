
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author var1541b
 */
public class Animals {
    private int power;

    public int getPower() {
        return power;
    }

    public Animals() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.println("Введите силу");
                power = Integer.parseInt(in.readLine());
                System.out.println();
                break;
            } catch (Exception error) {
                System.out.println("Некорректный ввод\n");
            }
        }
    }
}