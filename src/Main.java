import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar panelu: ");
        int size = scanner.nextInt();


        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
