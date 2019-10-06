package game;

public class Player {
    private int HP = 100;
    public Player(){
        hp();
    }

    protected void getHP(){
        System.out.println("Player HP: " + HP);
    }
    protected void setHP(int i){
        if(0 == i){
            System.out.println("ты прошел : " + (1 + (int) (Math.random() * 5)) + " км и нашел Колу");
            HP++;
            hp();
        } else {
            System.out.println("ты прошел : " + (1 + (int) (Math.random() * 5)) + " км и сильно устал");
            HP--;
        }
    }

    protected void setHP(String event){
        if (event.equals("суицид")){
            System.out.println("твой герой мертв");
            HP = 0;
        }
        if(event.equals("удар")){
            System.out.println("тебя ранило");
            HP-=25;
        }
    }

    private void hp(){
        if(HP >= 100)
            HP = 100;
    }
}
