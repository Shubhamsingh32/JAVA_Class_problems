import java.util.Scanner;

class ternaryOP {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println((a % 2 == 0) ? "Even" : "Odd");

        sc.close();

    }
}