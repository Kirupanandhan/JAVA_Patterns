import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {

        Scanner siz=new Scanner(System.in);
        System.out.println("Enter the size of the pattern");
        int size= siz.nextInt();



        for (int i = 0; i < size; i++) {
            // inner loop
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }}