package jp.ac.uryukyu.ie.e215710;

public class Ninja extends Character {
    public Ninja(String name, int hp, int chakra, int attack) {
        super(name, hp, chakra, attack) ;
    }

    /**
     * 自分自身にクナイで攻撃された時の、自分のHPが減るメソッド
     * 自分自身のHPがattack(攻撃力)の1.2倍のダメージ減る
     * 自分自身のHPが0以下になったらdeathの状態は死となる
     * @param damageKunai
     */
    @Override
    public void injuredKunai(int damageKunai) {
        hp -= damageKunai ;
        if (hp <= 0) {
            death = "死" ;
            System.out.println(name + "は静かに去っていった") ;
        }
    }

    /**
     * 自分自身に手裏剣で攻撃された時の、自分のHPが減るメソッド
     * HPがattack(攻撃力)のダメージ減る
     * 自分自身のHPが0以下になったらdeathの状態は死となる
     * @param damageKunai
     */
    @Override
    public void injuredShuriken(int damageShuriken) {
        hp -= damageShuriken ;
        if (hp <= 0) {
            death = "死" ;
            System.out.println(name + "は静かに去っていった") ;
            System.out.println() ;
        }
    }

    /**
     * Enemyへ螺旋丸で攻撃するメソッド
     * attack(攻撃力)の2倍のダメージを与えることが出来る
     * チャクラがattack(攻撃力)の半分より少なかったら螺旋丸を出すことは出来ない
     * @param enemy //敵
     */
    public void rasengan(Enemy enemy) {
        int damageRasengan = attack * 2 ;
        if (hp > 0 && chakra > (attack / 2) && enemy.getHp() > 0) {
            System.out.println(name + "は螺旋丸を出した！！") ;
            enemy.injuredRasengan(damageRasengan) ;
            chakra -=  (attack / 2) ;
            if (enemy.getHp() > 0) {
                System.out.println(name + "のHPは" + hp + "、" + enemy.getName() + "のHPは" + enemy.getHp()) ;
            }
            System.out.println() ;
        }
        else {
            System.out.println(name + "はチャクラ不足で螺旋丸を出すことが出来ない。。") ;
        }
    }

    /**
     * Ninjaのチャクラが回復するメソッド
     * 回復するには時間がかかる
     * 2ターンに1回しか回復できない
     * @param heel //チャクラの回復数
     */
    public void heelChakra(int heel) {
        chakra += heel ;
        System.out.println(name + "のチャクラは" + heel + "回復した！") ;
        System.out.println(name + "のチャクラは" + chakra + "である") ;
    }
}