import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int dice;
        int total = 0;

        System.out.print("How Many Dice You want? ");
        dice = scanner.nextInt();

        if(dice > 0){
            for(int i = 0; i < dice ; i++){
                int rol = random.nextInt(1, 7);
                printDice(rol);
                System.out.println("You Rolled: " + rol);
                total += rol;
            }

            System.out.println("***Your Total***: " + total);
        }
        else{
            System.out.println("You cant roll negative dice");
        }
    }

    static void printDice(int rol){
        String dice1 = """
                  _______
                |         |
                |    ●    |
                |         |
                  _______
                """;

        String dice2 = """
                  _______
                | ●       |
                |         |
                |       ● |
                  _______
                """;
        String dice3 = """
                  _______
                | ●       |
                |    ●    |
                |       ● |
                  _______
                """;

        String dice4 = """
                  _______
                | ●     ● |
                |         |
                | ●     ● |
                  _______
                """;

        String dice5 = """
                  _______
                | ●     ● |
                |    ●    |
                | ●     ● |
                  _______
                """;
        String dice6 = """
                  _______
                | ●     ● |
                | ●     ● |
                | ●     ● |
                  _______
                """;

        switch (rol){

            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);

            default -> System.out.println("Invalid roll");
        }
    }
}