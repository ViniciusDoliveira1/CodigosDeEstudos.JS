import java.util.Scanner;

public class projetoBase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        float dig1= scanner.nextFloat();
        System.out.println("digite o segundo numero: ");
        float dig2= scanner.nextFloat();
        System.out.println("Digite a operaçao (+,-,*,/): ");
        char operator = scanner.next().charAt(0);
        scanner.close();
        float result;

        switch(operator) {

            case '+':
            result = dig1 + dig2;
            break;
            case '-':
            result = dig1 - dig2;
            break;
            case '*':
            result= dig1 * dig2;
            break;
            case '/':
            result= dig1 / dig2;
            break;
            default:
            System.out.println("operação invalida.");
            return;
            
        }
        System.out.println("A OPERAÇÃO FOI: "+ dig1+" "+operator+" "+dig2+": "+result);
    }
}
