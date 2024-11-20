import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZeffitTest {

    @Test
    @DisplayName("[1] test isHitFree")
    void isHitFree() {
        Zeffit zef = new Zeffit();
        assertTrue(zef.isHitFree());
    }

    @Test
    @DisplayName("[1] test isGreen")
    void isGreen() {
        Zeffit zef = new Zeffit();
        zef.takesHit();
        assertFalse(zef.isHitFree(),"Expecting: <True> for isHitFree()\nGot: "+zef.isHitFree());
        assertTrue(zef.isGreen(),"Expecting: <True> for isGreen()\nGot: "+zef.isGreen());
    }

    @Test
    @DisplayName("[1] test isBlue")
    void isBlue() {
        Zeffit zef = new Zeffit();
        zef.takesHit();
        zef.takesHit();
        assertFalse(zef.isHitFree(),"Expecting: <True> for isHitFree()\nGot: "+zef.isHitFree());
        assertTrue(zef.isBlue(),"Expecting: <True> for isBlue()\nGot: "+zef.isBlue());
    }

    @Test
    @DisplayName("[1] test isRed")
    void isRed() {
        Zeffit zef = new Zeffit();
        zef.takesHit();
        zef.takesHit();
        zef.takesHit();
        assertFalse(zef.isHitFree(),"Expecting: <True> for isHitFree()\nGot: "+zef.isHitFree());
        assertTrue(zef.isRed(),"Expecting: <True> for isRed()\nGot: "+zef.isRed());
    }

    @Test
    @DisplayName("[1] test isDead")
    void isDead() {
        Zeffit zef = new Zeffit();
        zef.takesHit();
        zef.takesHit();
        zef.takesHit();
        zef.takesHit();
        assertFalse(zef.isHitFree(),"Expecting: <True> for isHitFree()\nGot: "+zef.isHitFree());
        assertTrue(zef.isDead(),"Expecting: <True> for isDead()\nGot: "+zef.isDead());
    }
}