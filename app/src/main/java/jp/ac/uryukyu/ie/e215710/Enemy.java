package jp.ac.uryukyu.ie.e215710;

public class Enemy extends Character {
    public Enemy(String name, int hp, int chakra, int attack) {
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
            System.out.println(name + "逃げた") ;
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
            System.out.println(name + "逃げた") ;
        }
    }

    /**
     * 自分自身に螺旋丸で攻撃された時の、自分のHPが減るメソッド
     * HPがattack(攻撃力)の2倍のダメージ減る
     * 自分自身のHPが0以下になったらdeathの状態は死となる
     * @param damageKunai
     */
    public void injuredRasengan(int damageRasengan) {
        hp -= damageRasengan ;
        if (hp <= 0) {
            death = "死" ;
            System.out.println(name + "は逃げた") ;
        }
    }
}