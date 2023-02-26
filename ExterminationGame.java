import java.util.*;
import java.util.Collections;

public class ExterminationGame {

    private LinkedList players;


    public ExterminationGame() {
        players = new LinkedList(); 
    }

    //Methods

    //Add Player to end of list
    public void add(Object o) {
        players.addLast(o);
    }

    public void display() {
        for (Object item : players) {
            System.out.println(item);
        }
    }

    public void shuffle() {
        Collections.shuffle(players);
    }


    public void play() {
        LinkedList gameList = new LinkedList();
        gameList = players;
        Random rn = new Random();
        int num = 0;
        for (int i = 1; i <= gameList.size(); i++) {
            if(gameList.size() == 1) {
                break;
            }
            num = rn.nextInt(2, gameList.size()) - 1;
            Collections.shuffle(gameList);
            gameList.remove(num);
            System.out.println("Round " + i + ":\nPlayers Remaining");
            for (Object item : gameList) {
                System.out.println(item);
            }
        }
        System.out.println(gameList.getFirst() + " is the winner\n" + num + " was the random number");


    }
}
