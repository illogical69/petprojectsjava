package game;
import java.util.Scanner;

public class Engine {
    private Player player = new Player();
    private boolean run = true;
    private Scanner in = new Scanner(System.in);
    private int e = 0;

    public Engine() {
        while (run) {
            lvl();
            player.getHP();
            e = 0 + (int) (Math.random() * 2);
            if(gameEvent(e).equals("монстр"))
                System.out.println("перед тобой показался монстр");
            System.out.print("Твой ход: ");
            keyEvent(in);
        }
    }

    private void lvl() {
        System.out.println("==============================");
    }

    private void keyEvent(Scanner sc) {
        if (sc.hasNextLine()) {
            switch (sc.nextLine()){
                case "суицид":
                    player.setHP("суицид");
                    System.out.println("Конец");
                    run = false;
                    break;
                case "идти":
                    if(!gameEvent(e).equals("монстр")) {
                        player.setHP(0 + (int) (Math.random() * 4));
                    } else {
                        System.out.println("ты уткнулся лицом в грудь монстра и тот сбил тебя с ног");
                        player.setHP("удар");
                    }
                    break;
                case "бой":
                    System.out.println("ты поборол монстра, очередное препятствие преодалено");
                    break;
                default:
                    System.err.println("Неизвестная команда");
                    break;
            }
        }

    }

    private String gameEvent(int e){
        if (1 == e)
            return "монстр";
        else return "пустота";
    }
}
