
import java.util.Scanner;
/*
 Написать два класса: Horse(лошадь) - в конструкторе задается кличка лошади и 
 Pegas(пегас) - релизующий метод полет(сообщает какая лошадь летит). 
 Унаследовать пегаса от лошади.
 */

/**
 * @author var1541b 13.04.2016
 */
public class Test1 {

    public static void main(String[] args) {
        String str;

        System.out.print("Введите кличку лошади: ");
        Scanner sc_str = new Scanner(System.in);

        try {
            str = sc_str.next();
            for (int i = 0; i < 10; i++) {
                if (str.contains("" + i)) {
                    System.out.println("Ошибка! Слово содержит число! \n");
                    return;
                }
            }
            Pegas pegas = new Pegas(str);
            pegas.fly();

        } catch (Exception e) {
        }
    }
}
