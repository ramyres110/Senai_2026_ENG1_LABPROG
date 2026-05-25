public class CalculaoDAreaDoTriangulo {
    public static double calcularAreaDoTriangulo(double base, double altura) {
        return (base * altura) / 2; // Fórmula para calcular a área do triângulo
    }

    public static void main(String[] args) {
        double base = args.length > 0 ? Double.parseDouble(args[0]) : 0; // Valor da base do triângulo
        double altura = args.length > 1 ? Double.parseDouble(args[1]) : 1.0; // Valor da altura do triângulo

        double area = calcularAreaDoTriangulo(base, altura);

        System.out.println("A área do triângulo é: " + area);
    }
}
