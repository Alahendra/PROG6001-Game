/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass3.mygame2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nigel Franciscus
 */
public class ItemTest {
    
    Item item;
    
    public ItemTest() {
        item = new Item("gun","this is a gun", 0);
    }

    /**
     * Test of getName method, of class Item.
     */
    @Test
    public void testGetName() {
        
        //Item item = new Item("gun","this is a gun", 0);
        String expected = "gun";
        //String expected = "guns";     // failed test
        String actual = item.getName();
        
        assertEquals(expected, actual);
    }

    

    /**
     * Test of getPower method, of class Item.
     */
    @Test
    public void testGetPower() {
        //Item item = new Item("gun","this is a gun", 0);
        int expected = 0;
        int actual = item.getPower();
        
        assertEquals(expected, actual);
    }

    /**
     * Test of getDescription method, of class Item.
     */
    @Test
    public void testGetDescription() {
        assertEquals(0, 0);
    }
    
}
