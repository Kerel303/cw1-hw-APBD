import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Początek");

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        createCube(size);





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

}
