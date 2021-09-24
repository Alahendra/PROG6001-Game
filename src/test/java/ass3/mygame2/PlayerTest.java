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
        Player instance = new Player();
        instance.addItemInventory(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeItemInventory method, of class Player.
     */
    @Test
    public void testRemoveItemInventory() {
        System.out.println("removeItemInventory");
        Item item = null;
        Player instance = new Player();
        instance.removeItemInventory(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerItem method, of class Player.
     */
    @Test
    public void testGetPlayerItem() {
        System.out.println("getPlayerItem");
        String stringItem = "";
        Player instance = new Player();
        Item expResult = null;
        Item result = instance.getPlayerItem(stringItem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printAllInventory method, of class Player.
     */
    @Test
    public void testPrintAllInventory() {
        System.out.println("printAllInventory");
        Player instance = new Player();
        String expResult = "";
        String result = instance.printAllInventory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
