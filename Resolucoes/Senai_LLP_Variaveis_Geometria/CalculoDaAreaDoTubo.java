public class CalculoDaAreaDoTubo {
    public static double calcularAreaDoTubo(double raio, double altura) {
        double areaBase = 2 * Math.PI * raio * raio; // Área das duas bases circulares
        double areaLateral = 2 * Math.PI * raio * altura; // Área lateral do tubo
        return areaBase + areaLateral; // Fórmula para calcular a área do tubo: A = 2πr² + 2πrh
    }

    public static void main(String[] args) {
        double raio = args.length > 0 ? Double.parseDouble(args[0]) : 1.0; // Valor do raio do tubo
        double altura = args.length > 1 ? Double.parseDouble(args[1]) : 1.0; // Valor da altura do tubo

        double area = calcularAreaDoTubo(raio, altura);

        System.out.println("A área do tubo é: " + area);
    }
}
