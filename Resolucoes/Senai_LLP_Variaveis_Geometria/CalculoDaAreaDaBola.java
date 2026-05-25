public class CalculoDaAreaDaBola {
    public static double calcularAreaDaBola(double raio) {
        return 4 * Math.PI * raio * raio; // Fórmula para calcular a área da bola (esfera): A = 4πr²
    }

    public static void main(String[] args) {
        double raio = args.length > 0 ? Double.parseDouble(args[0]) : 1.0; // Valor do raio da bola

        double area = calcularAreaDaBola(raio);

        System.out.println("A área da bola é: " + area);
    }
}
