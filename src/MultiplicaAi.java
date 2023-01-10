import java.util.Scanner;

public class MultiplicaAi {
    public static void main(String[] args) throws Exception {
        int count = 1;

        Scanner userNumber = new Scanner(System.in); // Create a Scanner object
        System.out.println("Insira um número para ver a sua tabuada!");

        Integer userInt = Integer.parseInt(userNumber.next());

        System.out.println("Tabela de multiplicação de" + " " + userInt);
        while (count <= 10) {
            int multiplicationResult = userInt * count;
            System.out.println(userInt + "*" + count + "=" + multiplicationResult);
            count++;
        }
        userNumber.close();
    }
}
