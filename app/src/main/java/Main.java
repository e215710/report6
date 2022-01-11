import jp.ac.uryukyu.ie.e215710.*;

public class Main {
    public static void main(String[]args) {
        System.out.println() ;
        Ninja ninja = new Ninja("NARUTO", 100, 10, 10) ;
        Enemy enemy = new Enemy("大蛇丸", 100, 5, 4) ;

        System.out.println(ninja.getName() + " VS " + enemy.getName()) ;
        System.out.println("果たしてどちらが勝つのだろうか・・・") ;
        System.out.println() ;

        int turn = 0 ;
        while(ninja.getDeath() == "生" && enemy.getDeath()== "生") {
            turn ++ ;
            if (ninja.getDeath() == "生" && enemy.getDeath()== "生") {
                System.out.println(turn + "ターン目") ;
            }
            ninja.rasengan(enemy) ;
            enemy.syuriken(ninja) ;

            turn ++ ;
            if (ninja.getDeath() == "生" && enemy.getDeath()== "生") {
                System.out.println(turn + "ターン目") ;
            }
            ninja.syuriken(enemy) ;
            enemy.kunai(ninja) ;
            
            if (turn % 2 == 0 && enemy.getHp() > 0) {
                ninja.heelChakra(10);
                System.out.println() ;
            }
        }
        System.out.println("激しい戦いは幕を閉じた") ;
    }
}