import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar kwadratu: ");
        int size = scanner.nextInt();
        System.out.println("Podaj szansę wystąpienia innego znaku (w %): ");
        double chance = scanner.nextDouble() / 100;
        if (chance > 1) {
            chance = 1;
        }
        createCube(size, chance);

        int[] values = {1, 2, 4, 5, 6, 3, 2};
        System.out.println("Średnia: " + CalculateAverage(values));

        scanner.close();
    }



    static void createCube(int size){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void createCube(int size, double chance){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(Math.random() >= chance){
                    System.out.print(" * ");
                }else{
                    System.out.print(" # ");
                }
                
            }
            System.out.println();
        }
    }


    static double CalculateAverage(int[] values){
        double sum = 0;
        for (int i : values) {
            sum += i;
        }
        return (sum/values.length);
    }

}
