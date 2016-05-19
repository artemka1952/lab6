
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
class Ape extends Animals {

    private int age;

    public int getAge() {
        return age;
    }

    public Ape() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.println("Введите возраст");
                age = Integer.parseInt(in.readLine());
                System.out.println();
                break;
            } catch (Exception error) {
                System.out.println("Неккоректный ввод\n");
            }
        }
    }

    public void fishing(Fish fish) {
        if (fish.isEdibility()) {
            if (this.getPower() > fish.getPower()) {
                System.out.println("Ловкая обезьяна поймала рыбку\n");
            } else {
                System.out.println("Рыбка потопила обезьяянку\n");
            }
        } else {
            System.out.println("Рыба несъедобна\n");
        }
    }
}
