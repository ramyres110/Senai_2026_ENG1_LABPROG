public class CalculoDaAreaDaPiramide {
    public static double calcularAreaDaPiramide(double base, double altura) {
        double areaBase = base * base; // Área da base quadrada
        double apotemaPiramide = Math.sqrt((altura * altura) + ((base / 2) * (base / 2))); // Apótema da pirâmide
        double areaLateral = 2 * base * apotemaPiramide; // Área lateral (4 triângulos)
        return areaBase + areaLateral; // Fórmula para calcular a área da pirâmide
    }

    public static void main(String[] args) {
        double base = args.length > 0 ? Double.parseDouble(args[0]) : 1.0; // Valor da base da pirâmide
        double altura = args.length > 1 ? Double.parseDouble(args[1]) : 1.0; // Valor da altura da pirâmide

        double area = calcularAreaDaPiramide(base, altura);

        System.out.println("A área da pirâmide é: " + area);
    }
}
