package jp.ac.uryukyu.ie.e215710;

public class Ninja extends Character {
    public Ninja(String name, int hp, int chakra, int attack) {
        super(name, hp, chakra, attack) ;
    }

    @Override
    public void injuredKunai(int damageKunai) {
        hp -= damageKunai ;
        if (hp <= 0) {
            death = "死" ;
            System.out.println(name + "は静かに去っていった") ;
        }
    }

    public void injuredShuriken(int damageShuriken) {
        hp -= damageShuriken ;
        if (hp <= 0) {
            death = "死" ;
            System.out.println(name + "は静かに去っていった") ;
            System.out.println() ;
        }
    }
}
