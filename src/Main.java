import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wersja main");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar kwadratu: ");
        int size = scanner.nextInt();
        System.out.println("Podaj szansę wystąpienia innego znaku (w %): ");
        double chance = scanner.nextDouble() / 100;
        if (chance > 1) {
            chance = 1;
        }
        createCube(size, chance);

        int[] values = {1, 2, 4, 5, 6, 3, 2, 7};
        System.out.println("Średnia: " + CalculateAverage(values));
        System.out.println("Największa: " + CalculateMax(values));

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

    static int CalculateMax(int[] values){
        int max = values[0];
        for (int i : values) {
            if(max < i){
                max = i;
            }
        }
        return max;
    }

    static int CalculateMin(int[] values){
        int min = values[0];
        for (int i : values) {
            if(min > i){
                min = i;
            }
        }
        return min;
    }

}
