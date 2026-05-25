import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Carro {
    private String modelo;

    public Carro(String m) {
        this.modelo = m;
    }

    public String getModelo() {
        return modelo;
    }
}

class Item{
    public String nome;
    public double preco;

    public Item(String n, double p) {
        nome = n;
        preco = p;
    }
}

public class Exemplo {
    public static void main(String[] args) {

        Item[] listaDeCompras = {
            new Item("Banana", 10.00),
            new Item("Caju", 16.00),
            new Item("Acerola", 9.90),
        };

        ArrayList<Item> listaDinamica = new ArrayList<>();
        listaDinamica.add(new Item("Manga", 9.30));
        listaDinamica.add(new Item("Uva", 30.00));

        ArrayList<Integer> x;
        ArrayList<String> s;
    
        HashMap<String, ArrayList<Item>> h = new HashMap<>();
        h.put("20260508", listaDinamica);
        


    }
}
