import java.util.*;

public class ExterminationGameTester {
    public static void main(String[] args) {
        ExterminationGame game = new ExterminationGame();
        Scanner keyIn = new Scanner(System.in);
        int x;
        do {
            System.out.println("\tExterminate! Exterminate!");
            System.out.println("===============================");
            System.out.println("\t[1] Add Player");
            System.out.println("\t[2] Display Player List");
            System.out.println("\t[3] Shuffle Player List");
            System.out.println("\t[4] Play Exterminate Game!");
            System.out.println("\t[0] Quit");

            System.out.print("Enter Choice: ");
            x = keyIn.nextInt();
            
            switch(x) {
                case 1: {
                    System.out.println("Enter player name: ");
                    String name = keyIn.next();
                    game.add(name);
                    break;
                }
                case 2: {
                    game.display();
                    break;
                }
                case 3: {
                    game.shuffle();
                    System.out.println("Shuffled List: ");
                    game.display();
                    break;
                }
                case 4: {
                    game.play();
                    System.out.println("The List of Players: ");
                    game.display();
                    break;
                }
                case 0: {
                    break;
                }
            }

        } while(x != 0);






        

        
    }
}
