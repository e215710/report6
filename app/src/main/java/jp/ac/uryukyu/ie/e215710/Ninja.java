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

    @Override
    public void injuredShuriken(int damageShuriken) {
        hp -= damageShuriken ;
        if (hp <= 0) {
            death = "死" ;
            System.out.println(name + "は静かに去っていった") ;
            System.out.println() ;
        }
    }

    public void rasengan(Enemy enemy) {
        int damageRasengan = attack * 2 ;
        if (hp > 0) {
            System.out.println(name + "は螺旋丸を発動した！！") ;

            if (enemy.getHp() > 0) {
                System.out.println(name + "のHPは" + hp + "、" + enemy.getName() + "のHPは" + enemy.getHp()) ;
            }
            System.out.println() ;
        }
    }
}