package jp.ac.uryukyu.ie.e215710;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NinjaTest {
    /**
     * 忍者はチャクラの量が攻撃力の半分より少ないとき螺旋丸を出せないことを検証。
     * （１）忍者と敵を準備。
     * （２）忍者のチャクラは攻撃力の半分より少ないとする。
     * （３）忍者のチャクラは攻撃力の半分より少ないため螺旋丸を出せないことを期待。
     */

    @Test
    void rasenganTest() {
        int defaultNinjaChakra = 4 ;
        Ninja a = new Ninja("忍者a", 30, defaultNinjaChakra, 10) ;
        Enemy b = new Enemy("敵b", 30, 4, 10) ;
        a.rasengan(b) ;
        b.syuriken(a) ;
        assertEquals(defaultNinjaChakra, a.getChakra()) ;
    }
}