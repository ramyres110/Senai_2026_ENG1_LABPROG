import java.io.File;
import java.util.Scanner;

interface VeiculoInterface {
    void ligar();

    void desligar();

    boolean estaLigado();
}

interface IPessoa {
    String getNome();

    String getDocumento();
}

class PessoaFisica implements IPessoa {

    @Override
    public String getNome() {
        return "PF";
    }

    @Override
    public String getDocumento() {
        return "CPF";
    }

}

class PessoaJuridica implements IPessoa {
    @Override
    public String getNome() {
        return "PJ";
    }

    @Override
    public String getDocumento() {
        return "CNPJ";
    }
}

class PessoaInternacional implements IPessoa {
    @Override
    public String getNome() {
        return "PASSPORTE";
    }

    @Override
    public String getDocumento() {
        return "PASSPORTE";
    }
}

abstract class Veiculo implements VeiculoInterface {
    private boolean ligado;
    protected String modelo;
    protected int anoFabricacao;
    protected final String barulho = "Vrunmnm";

    public void ligar() {
        ligado = true;
    };

    public void desligar() {
        ligado = true;
    };

    public boolean estaLigado() {
        return ligado;
    }
}

class Carro extends Veiculo {
    protected int qtdRodas = 4;

    public Carro() {
        this.modelo = "";
    }
}

class Caminhonete extends Carro {
    int nivelArla = 0;

    public Caminhonete() {
        this.qtdRodas = 6;
    }

    @Override
    public void ligar() {
        if (nivelArla > 0) {
            super.ligar();
        }
    }

    public void ligar(boolean comChave) {
        super.ligar();
    }

    public void ligar(String codigoDaChave) {
        super.ligar();
    }
}

class Navio extends Veiculo {
    private long HPEDoMotor = 0;

    public Navio(String m, long hpe) {
        this.modelo = m;
        this.HPEDoMotor = hpe;
    }

    public long getHPEDoMotor() {
        return this.HPEDoMotor;
    }

    public void setHPEDoMotor(long valor) {
        this.HPEDoMotor = valor;
    }

}

class App extends Object {
    public static int PID = 0;

    public void Imprimi(VeiculoInterface v) {
        v.ligar();
        if (v.estaLigado())
            System.out.println("Sim");
        v.desligar();
    }

    public void Imprimi(IPessoa p) {
        System.out.println("Pessoa: " + p.getNome() + "; Documento:" + p.getDocumento());
    }

    public void start() {
        int x = 0;

        var fiatToro = new Caminhonete();
        fiatToro.ligar();
        fiatToro.ligar(true);
        fiatToro.ligar("asdasdasd");
        Imprimi(fiatToro);

        Navio lancha = new Navio("Nautica LP390", 15);
        lancha.setHPEDoMotor(50);

        lancha.ligar();
        Imprimi(lancha);

        var pf = new PessoaFisica();
        var pj = new PessoaJuridica();

        Imprimi(pj);
        Imprimi(pf);
        Imprimi(new PessoaInternacional());

    }
}

public class Orientacao {
    public static void main(String[] args) {
        new App().start();
    }
}
