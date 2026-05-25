import java.util.Random;
import java.util.Scanner;

public class Dados {
    static String[] lados = { """
            +-------+
            |       |
            |   *   |
            |       |
            +-------+""",
            """
                    +-------+
                    |       |
                    | *   * |
                    |       |
                    +-------+""",
            """
                    +-------+
                    |     * |
                    |   *   |
                    | *     |
                    +-------+"""
    };

    public static void main(String[] args) {
        Random r = new Random();


        int sorteios = new Scanner(System.in).nextInt();
        for (int i = 0; i < sorteios; i++) {
            int sorteio = (int)(Math.random() * lados.length);
            System.out.println(lados[sorteio]);
        }
    }
}
