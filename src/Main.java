import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar panelu: ");
        int size = scanner.nextInt();

        System.out.println("Podaj szanse wystapienia innego elementu (w %): ");
        double chance = scanner.nextDouble();
        if (chance > 100) {
            chance = 100;
        }
        if (chance < 0) {
            chance = 0;
        }
        chance = chance/100;

        int counter = 0;

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(Math.random() > chance){
                    System.out.print(" * ");
                }else {
                    System.out.print(" # ");
                    counter++;
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Wszystkie znaki: " + size*size);
        System.out.println("Otrzymane znaki specjalne: " + counter);


    }
}
