public class CalculatingAverage {

    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);

        System.out.println("Nota 1: ");
        double nota1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Nota 2: ");
        double nota2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Nota 3: ");
        double nota3 = Double.parseDouble(scanner.nextLine());

        double avg = (nota1 + nota2 + nota3) / 3;
        System.out.println("Média do aluno: " + avg);
    }
}
