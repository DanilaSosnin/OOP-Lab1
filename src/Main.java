import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int number = 0;
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        for (char c : line.toCharArray()) {
            System.out.print(c + "  ");
        }
        System.out.print("\n");
        for (char c : line.toLowerCase().toCharArray()) {
            if (c >= 'а' && c <= 'я' || c == 'ё') {
                if (c == 'ё') number = 7;
                else if (c >= 'ж') number = c - 'а' + 2;
                else number = c - 'а' + 1;
                System.out.print(number > 9? number + " ": number + "  ");
            }
            else System.out.print(c + "  ");
        }
    }
}