package test;

import static main.BalancedBrackets.hasBalancedBrackets;
import main.BalancedBrackets;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void noBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullThrowsIllegalArgumentException(){
        hasBalancedBrackets(null);
        fail("This shouldn't happen because there should have been an error");
    }

    @Test
    public void stringInBracketsReturnsTrue(){
        assertTrue(hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void stringAndBracketsReturnsTrue(){
        assertTrue(hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void wrongOrderBracketsReturnsFalse(){
        assertFalse(hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void onlyRightBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void onlyLeftBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void invertedBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("]["));

    }
}
