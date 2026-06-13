package com.ramyres;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private Tabela tabela;

    public Main() {
        this.tabela = new Tabela();
    }

    public void lerArquivo(String caminhoDoArquivo) {
        File arquivo = new File(caminhoDoArquivo);
        if (!arquivo.exists()) {
            System.out.println("Arquivo inexistente.");
            return;
        }

        try {
            Scanner sc = new Scanner(arquivo);
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                Partida p = new Partida(linha);
                this.tabela.adicionarPartida(p);
            }
        } catch (Exception e) {
            System.err.println("Erro na leitura. Error" + e.getMessage());
            e.printStackTrace();
        }
    }

    public void imprimirTabela() {
        ArrayList<Time> classificacao = this.tabela.obterClassificacao();
        
        System.out.println("+-----------------------------------------------+");
        System.out.println("|      C  L  A  S  S  I  F  I  C  A  Ç  Ã  O    |");
        System.out.println("+----+-------------------------+--------+-------+");
        System.out.println("| #  | Time                    | Pontos | Saldo |");
        System.out.println("+----+-------------------------+--------+-------+");

        int pos = 0;
        for (Time t : classificacao) {
            pos++;
            String ps = String.format("%2s",pos);
            System.out.printf("| %s | %-23s | %-6d | %-5d |\n",ps, t.getNome(), t.getPontos(), t.saldoDeGols());
            System.out.println("+----+-------------------------+--------+-------+");
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Informe o arquivo. Ex: java Main.java jogos.txt");
            return;
        }

        Main m = new Main();
        m.lerArquivo(args[0]);
        m.imprimirTabela();
    }
}