import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Exemplo {

    public void Imprimir(String mensagem) throws Exception{
        throw new RuntimeException("Deu erro mané!");
    }

    public void Acao() throws Exception{
        this.Imprimir("Hello WOrd");
    }

    public static void main(String[] args) {
        // Argumentos
        // args
        // String texto = args[0];
        // String quebra = args[1];

        // String[] vetor = texto.split(quebra);

        // for (String termo : vetor) {
        //     System.out.println(String.format("*\t %s %.2f", termo, 99.9988787));
        // }

        // return;
        // Redirecionador padrão saída
        // * Saida padrão (System.out)
        // > Redirecionador saída padrãpo
        // >> Redirecionador append padrãp

        // Input com pipe
        // output | input -> programa
        // Scanner sc = new Scanner(System.in);

        // int qtdLinhas = 0;
        // while (sc.hasNextLine()) {
        //     String linha = sc.nextLine().toLowerCase();
            
        //     if(linha.indexOf("alice") > 0){
        //         qtdLinhas++;
        //     }
        //     // if (linha != "")
        // }

        // System.out.println(qtdLinhas);
        // System.err.println("Erro!");

        // try {
        // double x = 100/(2-2);
        // System.out.println("Resultado: "+x);
        // } catch (Exception e) {
        // // TODO: handle exception
        // System.err.println("Error: "+e.getMessage());
        // System.err.println("Error: "+e.getMessage());
        // }

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());

        String d1 = """
+-------+ 
|       | 
|   *   | 
|       | 
+-------+ """;
        String[] lados = {d1};
        System.out.println(lados[0]);

        // Generics
        // ArrayList
        // HashMap
        //

        // Excecoes
        try {
            new Exemplo().Acao();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        try {
            FileWriter meuArquivo = new FileWriter("Receita.txt");
            meuArquivo.write(lados[0]);
            meuArquivo.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}