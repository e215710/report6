import jp.ac.uryukyu.ie.e215710.Enemy;
import jp.ac.uryukyu.ie.e215710.Ninja;

public class Main {
    public static void main(String[]args) {
        System.out.println() ;
        Ninja ninja = new Ninja("NARUTO", 60, 10, 10) ;
        Enemy enemy = new Enemy("大蛇丸", 60, 5, 4) ;

        System.out.println(ninja.getName() + " VS " + enemy.getName()) ;
        System.out.println("果たしてどちらが勝つのだろうか・・・") ;
        System.out.println() ;

        int turn = 0 ;
        while(ninja.getDeath() == "生" && enemy.getDeath()== "生") {
            turn ++ ;
            System.out.println(turn + "ターン目") ;
            ninja.rasengan(enemy);
            enemy.syuriken(ninja) ;
        }
        System.out.println("激しい戦いは幕を閉じた") ;
    }
}
