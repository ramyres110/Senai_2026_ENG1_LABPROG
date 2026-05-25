import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Arquivos {

    public void AbrirEEscreverOi(String caminho) {
        try {
            FileWriter fw = new FileWriter(caminho);
            fw.write("Hi Lorena, how are u? nice me to u!");
            fw.close();

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public void lerArquivo(String caminho) throws FileNotFoundException {
        File arquivo = new File(caminho);
        Scanner scanner = new Scanner(arquivo);
        // while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            System.out.println("*\t" + linha);
        scanner.close();
            // }
    }

    public static void SayHi() {
        System.out.println("HI");
    }

    public static void main(String[] args) {
        File erro = new File("Erro.txt");
        System.out.println("Eh arquivo: " + erro.isFile());
        System.out.println("Eh diretorio: " + erro.isDirectory());
        System.out.println("Nome: " + erro.getName());
        System.out.println("Caminho: " + erro.getPath());
        System.out.println("Tamanho " + erro.length());
        System.out.println(erro.canRead());
        System.out.println(erro.canWrite());

        File pasta = new File(".");
        System.out.println("Eh pasta" + pasta.isDirectory());
        System.out.println("Arquivos:");
        for (var arq : pasta.listFiles()) {
            System.out.println("*" + arq.getName());
        }

        Arquivos.SayHi();

        Arquivos arq = new Arquivos();
        arq.AbrirEEscreverOi("meuarquivo.txt");

        try {
            arq.lerArquivo("meuarquivo.txt");
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println(e);
        }

    }
}