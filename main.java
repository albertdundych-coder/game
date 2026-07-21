import java.util.Scanner;
import java.util.Random;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int user = 0;
        int attempts = 0;
        int robot = 0;
        boolean red = true;
        int level ;
        
       
    
        while (red != false){
            System.out.println("Enter your level");
            System.out.println("If level 1 is from 0 to 25!");
            System.out.println("If level 2 is from 0 to 50!");
            System.out.println("If level 3 is from 0 to 100!");
            level = scanner.nextInt();

            if(level == 1){
            robot = random.nextInt(25) + 1;
            red = false;
            } else if(level == 2){
            robot = random.nextInt(50) + 1;
            red = false;
            } else if(level == 3){
            robot = random.nextInt(100) + 1;
            red = false;
            } else {
                System.out.println("There is not this level Max level 3");
                red = true;
            }
        }

        while (user != robot){

            System.out.println("Enter your number!");
            user = scanner.nextInt();
            attempts++;

            if (attempts < 8) {
                if (user < robot){
                    System.out.println("The number is higher!");
                } else if ( user > robot){
                    System.out.println("The number is lower!");
                } else if (user == robot) {
                    System.out.println("Congratulations! You won!");
                    System.out.println("You beat the game in " + attempts + " " +"attemps!");
                }
            }

            else {
                System.out.println("You lose! Max is 8 attempts");
                break;
            }
        }

    }  
}