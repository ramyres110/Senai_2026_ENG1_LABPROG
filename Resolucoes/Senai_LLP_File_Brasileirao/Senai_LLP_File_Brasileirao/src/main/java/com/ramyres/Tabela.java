package com.ramyres;

import java.util.ArrayList;
import java.util.HashMap;

public class Tabela {
    private ArrayList<Partida> historico;

    public Tabela() {
        this.historico = new ArrayList<>();
    }

    public void adicionarPartida(Partida p) {
        this.historico.add(p);
    }

    public ArrayList<Partida> getHistorico() {
        return this.historico;
    }

    public ArrayList<Time> obterClassificacao() {
        HashMap<String, Time> dados = processarHistorico();
        return classificarTimes(dados);
    }

    private ArrayList<Time> classificarTimes(HashMap<String, Time> dados) {
        ArrayList<Time> classificacao = new ArrayList<>();
        for (Time t : dados.values()) {
            classificacao.add(t);
        }

        for (int i = 0; i < classificacao.size(); i++) {
            for (int j = 0; j < classificacao.size(); j++) {
                Time ti = classificacao.get(i);
                Time tj = classificacao.get(j);
                if (tj.getPontos() < ti.getPontos()) {
                    classificacao.set(j, ti);
                    classificacao.set(i, tj);
                }
                if (tj.getPontos() == ti.getPontos() && tj.saldoDeGols() < ti.saldoDeGols()) {
                    classificacao.set(j, ti);
                    classificacao.set(i, tj);
                }
            }
        }

        return classificacao;
    }

    private HashMap<String, Time> processarHistorico() {
        HashMap<String, Time> dados = new HashMap<>();

        for (Partida p : this.historico) {
            Time tA = p.getTimeA();
            if (dados.containsKey(tA.getNome())) {
                tA = dados.get(tA.getNome());
            }

            Time tB = p.getTimeB();
            if (dados.containsKey(tB.getNome())) {
                tB = dados.get(tB.getNome());
            }

            EResultado resultado = p.getResultado();
            switch (resultado) {
                case EMPATE:
                    tA.setEmpates(tA.getEmpates() + 1);
                    tB.setEmpates(tB.getEmpates() + 1);
                    break;
                case VITORIA_TIME_A:
                    tA.setVitorias(tA.getVitorias() + 1);
                    tB.setDerrotas(tB.getDerrotas() + 1);
                    break;
                case VITORIA_TIME_B:
                    tA.setDerrotas(tA.getDerrotas() + 1);
                    tB.setVitorias(tB.getVitorias() + 1);
                    break;
                default:
                    break;
            }

            tA.setGolsFeitos(tA.getGolsFeitos() + p.getGolsA());
            tA.setGolsSofridos(tA.getGolsSofridos() + p.getGolsB());

            tB.setGolsFeitos(tB.getGolsFeitos() + p.getGolsB());
            tB.setGolsSofridos(tB.getGolsSofridos() + p.getGolsA());

            // Atualizo;
            dados.put(tA.getNome(), tA);
            dados.put(tB.getNome(), tB);
        }

        return dados;
    }
}
