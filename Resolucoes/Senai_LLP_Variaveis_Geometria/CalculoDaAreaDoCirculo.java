public class CalculoDaAreaDoCirculo {
    public static double calcularAreaDoCirculo(double raio) {
        return Math.PI *  raio * raio; // Fórmula para calcular a área do círculo: A = πr²
    }

    public static void main(String[] args) {
        double raio = 0;
        if(args.length == 0) {
            System.out.println("Seja bem vindo ao programa de cálculo da área do círculo!");
            System.out.print("Forneça o valor do raio do círculo: ");
            var scanner = new java.util.Scanner(System.in);
            raio = scanner.nextDouble();
        } else {
            raio = args.length > 0 ? Double.parseDouble(args[0]) : 1.0; // Valor do raio do círculo
        }

        double area = calcularAreaDoCirculo(raio);

        System.out.println("A área do círculo é: " + area);
    }
}
