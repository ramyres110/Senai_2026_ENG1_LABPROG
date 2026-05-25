public class CalculoDaAreaDoRetangulo {
    public static double calcularAreaDoRetangulo(double base, double altura) {
        return base * altura; // Fórmula para calcular a área do retângulo
    }

    public static void main(String[] args) {
        double base = args.length > 0 ? Double.parseDouble(args[0]) : 0; // Valor da base do retângulo
        double altura = args.length > 1 ? Double.parseDouble(args[1]) : 1.0; // Valor da altura do retângulo

        double area = calcularAreaDoRetangulo(base, altura);

        System.out.println("A área do retângulo é: " + area);
    }
}
