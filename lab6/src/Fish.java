
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
class Fish extends Animals {

    //Съедобность рыбы
    private boolean edibility;

    public Fish() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int check_fish;

        while (true) {
            try {
                System.out.println("Введите съедобность рыбы: 1 - съедобная, 0 - несъедобная:");
                check_fish = Integer.parseInt(in.readLine());
                if (check_fish == 0) {
                    edibility = false;
                    System.out.println();
                    break;
                }
                if (check_fish == 1) {
                    edibility = true;
                    System.out.println();
                    break;
                }
                System.out.println("Неккоректный ввод\n");
            } catch (Exception error) {
                System.out.println("Неккоректный ввод\n");
            }
        }
    }

    public boolean isEdibility() {
        return edibility;
    }
}
