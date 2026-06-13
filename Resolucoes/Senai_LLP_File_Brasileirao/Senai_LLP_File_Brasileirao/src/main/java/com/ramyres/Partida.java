package com.ramyres;

public class Partida {
    private int rodada;
    private Time timeA;
    private Time timeB;
    private int golsA;
    private int golsB;

    public Partida(int rodada, Time a, Time b, int ga, int gb) {
        this.rodada = rodada;
        this.timeA = a;
        this.timeB = b;
        this.golsA = ga;
        this.golsB = gb;
    }

    public Partida(String linha) {
        // "1, Atlético_Mineiro, Palmeiras, 2x1"
        // ["1", "Atlético_Mineiro", "Palmeiras", " 2x1"]
        String[] partes = linha.split(",");
        // [0] = "1"
        // [1] = "Atlético_Mineiro"
        // [2] = "Palmeiras"
        // [3] = "2x1"

        // int x = 89;
        // int[] arr = [199,89]
        // imc = (arr[1] * arr[0]) / 2

        int rodada = Integer.parseInt(partes[0].trim());
        String nomeTimeA = partes[1].trim();
        String nomeTimeB = partes[2].trim();

        String[] placar = partes[3].split("x");
        // [0] 2
        // [1] 1

        int golsA = Integer.parseInt(placar[0].trim());
        int golsB = Integer.parseInt(placar[1].trim());

        Time timeA = new Time(nomeTimeA);
        Time timeB = new Time(nomeTimeB);

        // Preencher objeto
        this.rodada = rodada;
        this.timeA = timeA;
        this.timeB = timeB;

        this.golsA = golsA;
        this.golsB = golsB;
    }

    public EResultado getResultado() {
        if (golsA > golsB) {
            return EResultado.VITORIA_TIME_A;
        } else if (golsB > golsA) {
            return EResultado.VITORIA_TIME_B;
        } else {
            return EResultado.EMPATE;
        }
    }

    public int getGolsA() {
        return golsA;
    }

    public int getGolsB() {
        return golsB;
    }

    public int getRodada() {
        return rodada;
    }

    public Time getTimeA() {
        return timeA;
    }

    public Time getTimeB() {
        return timeB;
    }

    public void setGolsA(int golsA) {
        this.golsA = golsA;
    }

    public void setGolsB(int golsB) {
        this.golsB = golsB;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    public void setTimeA(Time timeA) {
        this.timeA = timeA;
    }
}
