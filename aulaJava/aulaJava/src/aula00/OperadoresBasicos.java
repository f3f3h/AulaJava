package aula00;

public class OperadoresBasicos {
    public static void main(String [] args) {
        int a = 10;
        int b = 5;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = "  + (a % b));

        System.out.println("a > b?" + (a > b));
        System.out.println("a == b?" + (a == b));

        boolean condicao1 = (a > 8);
        boolean condicao2 = (b < 3);
        System.out.println("condicao1 && condicao2: " + (condicao1 && condicao2));
        System.out.println("condicao1 || condicao2: " + (condicao1 || condicao2));
        System.out.println("!condicao1: " + (!condicao1));
    }
}


