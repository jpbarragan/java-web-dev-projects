package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    // Test 1
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    // Test 2
    @Test
    public void testStringWithNoBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    // Test 3
    @Test
    public void stringOutsideBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]String"));
    }

    // Test 4
    @Test
    public void stringInsideBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[String]"));
    }

    // Test 5
    @Test
    public void singleRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    // Test 6
    @Test
    public void singleLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    // Test 7
    @Test
    public void testUnbalancedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    // Test 8
    @Test
    public void testUnclosedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch"));
    }

    // Test 9
    @Test
    public void testUnopenedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]"));
    }

    // Test 10
    @Test
    public void testReversedBracketsWithString() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    // Test 11
    @Test
    public void balancedBracketsInbetweenCharsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[st]r"));
    }

    // Test 12
    @Test
    public void testCrazyBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[][][]]]]][[[[]]"));
    }


    }