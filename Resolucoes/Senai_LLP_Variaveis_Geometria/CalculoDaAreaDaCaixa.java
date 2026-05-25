public class CalculoDaAreaDaCaixa {
    public static double calcularAreaDaCaixa(double comprimento, double largura, double altura) {
        return 2 * (comprimento * largura + comprimento * altura + largura * altura); // Fórmula para calcular a área da caixa: A = 2(ab + ac + bc)
    }

    public static void main(String[] args) {
        double comprimento = args.length > 0 ? Double.parseDouble(args[0]) : 1.0; // Valor do comprimento da caixa
        double largura = args.length > 1 ? Double.parseDouble(args[1]) : 1.0; // Valor da largura da caixa
        double altura = args.length > 2 ? Double.parseDouble(args[2]) : 1.0; // Valor da altura da caixa

        double area = calcularAreaDaCaixa(comprimento, largura, altura);

        System.out.println("A área da caixa é: " + area);
    }
}
