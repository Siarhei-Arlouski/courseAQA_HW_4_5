import Tools.Tools;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tools tools = new Tools();
        tools.toolsCost();

        System.out.println("Enter the number of tool to purchase: ");
        Scanner scanner = new Scanner(System.in);
        double numberOfTool = scanner.nextDouble();

        if (numberOfTool <= 0 || numberOfTool > 8) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Sorry, incorrect number. Try again");
            }
        } else {
            System.out.println("Thank you!");
        }
    }
}