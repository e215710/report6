package jp.ac.uryukyu.ie.e215710;

public class Enemy extends Character {
    public Enemy(String name, int hp, int chakra, int attack) {
        super(name, hp, chakra, attack) ;
    }

    @Override
    public void injuredKunai(int damageKunai) {
        hp -= damageKunai ;
        if (hp <= 0) {
            death = "死" ;
            System.out.println(name + "逃げた") ;
        }
    }

    @Override
    public void injuredShuriken(int damageShuriken) {
        hp -= damageShuriken ;
        if (hp <= 0) {
            death = "死" ;
            System.out.println(name + "逃げた") ;
        }
    }
}
