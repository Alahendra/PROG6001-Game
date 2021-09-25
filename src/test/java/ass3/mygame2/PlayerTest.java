/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass3.mygame2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author munuka
 */
public class PlayerTest {
    
    public PlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    /**
     * Test of addItemInventory method, of class Player.
     */
    @Test
    public void testAddItemInventory() {
        System.out.println("addItemInventory");
        Item item = null;
        item = new Item("key", "It has a shape of a heart", 100);
        Player instance = new Player();
        instance.addItemInventory(item);
        
        assertEquals("It has a shape of a heart",item.getDescription());
        
    }

    
    
}
