package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    BalancedBrackets testClass;

    //TODO: add tests here
    @Before
    public void generateClass() {
        testClass = new BalancedBrackets();
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(testClass.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsBeforeWordReturnsTrue() {
        assertTrue(testClass.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void bracketsAfterWordReturnsTrue() {
        assertTrue(testClass.hasBalancedBrackets("LaunchCode[]"));
    }

    @Test
    public void bracketsAroundWordReturnsTrue() {
        assertTrue(testClass.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void bracketsInsideWordReturnsTrue() {
        assertTrue(testClass.hasBalancedBrackets("[Launch]Code"));
    }

    @Test
    public void nestedBracketsReturnsTrue() {
        assertTrue(testClass.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void singleBracketReturnsFalse() {
        assertFalse(testClass.hasBalancedBrackets("["));
    }

    @Test
    public void singleClosingBracketReturnsFalse() {
        assertFalse(testClass.hasBalancedBrackets("]"));
    }

    @Test
    public void reversedBracketsReturnsFalse() {
        assertFalse(testClass.hasBalancedBrackets("]["));
    }

    @Test
    public void singleBracketInsideBalancedReturnsFalse() {
        assertFalse(testClass.hasBalancedBrackets("[]]"));
    }

    @Test
    public void closingBracketBeforeBalancedReturnsFalse() {
        assertFalse(testClass.hasBalancedBrackets("][]"));
    }

    @Test
    public void stringWithoutBracketsReturnsTrue() {
        assertTrue(testClass.hasBalancedBrackets("LaunchCode"));
    }

    @Test
    public void repeatedBracketsReturnsTrue() {
        assertTrue(testClass.hasBalancedBrackets("[][]"));
    }

}
