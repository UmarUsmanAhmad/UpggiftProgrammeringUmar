package Assignment1;

import java.util.Scanner;

public class Usermain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        UserInput obj = new UserInput(0, 0);
        while (true) {
            System.out.print("Enter Input: ");
            String inputText = scan.nextLine();
            if (inputText.equalsIgnoreCase("Stop")) {
                break;
            }
            obj.setText(inputText);
        }
        System.out.println("Number of Chars: " + obj.getNumChar());
        System.out.println("Number of Lines: " + obj.getRows());
    }
}
