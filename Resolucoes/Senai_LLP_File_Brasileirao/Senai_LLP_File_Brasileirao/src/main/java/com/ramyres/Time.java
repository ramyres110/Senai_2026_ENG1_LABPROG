package com.ramyres;

public class Time {
    private String nome;
    private int golsFeitos = 0;
    private int golsSofridos = 0;
    private int partidas = 0;
    private int vitorias = 0;
    private int empates = 0;
    private int derrotas = 0;

    public Time(String n) {
        this.nome = n;
    }

    public int getPontos() {
        return (vitorias * 3) + empates;
    }

    public int saldoDeGols(){
        return golsFeitos - golsSofridos;
    }

    public int getGolsFeitos() {
        return golsFeitos;
    }

    public String getNome() {
        return nome;
    }

    public int getGolsSofridos() {
        return golsSofridos;
    }

    public int getPartidas() {
        return partidas;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setGolsFeitos(int golsFeitos) {
        this.golsFeitos = golsFeitos;
    }

    public void setGolsSofridos(int golsSofridos) {
        this.golsSofridos = golsSofridos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPartidas(int partidas) {
        this.partidas = partidas;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
}
