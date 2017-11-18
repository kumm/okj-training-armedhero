package trial.armedhero;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class HeroTest {

    private Hero hero = new Hero();
    private Hero hero2 = new Hero();

    @Test
    public void heroAlive() throws Exception {
     assertTrue(hero.isAlive());
    }


    @Test
    public void heroattack(){
        int tamadasElotti = hero2.getHp();
        hero.attack(hero2);
        int tamadasUtani = hero2.getHp();
        assertTrue(tamadasElotti>tamadasUtani);
    }
    @Test
    public void masikFegyverTamadas(){
        hero2.setFegyver(new Kard());
        hero2.attack(hero);
        assertEquals(hero.getHp(),0);
    }

    @Test
    public void masikFegyverDuplaTamadas(){
        hero2.setFegyver(new Kard());
        hero2.attack(hero);
        hero2.attack(hero);
        assertFalse(hero.isAlive());
    }

}
