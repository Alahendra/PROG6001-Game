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
public class GameTest {
    
    public GameTest() {
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
     * Test of processCommand method, of class Game.
     
    @Test
    public void testProcessCommand() {
        System.out.println("processCommand");
        Command command = new Command("take","key");
        Game instance = new Game();
        boolean expResult = true;
        boolean result = instance.processCommand(command);
        assertEquals(expResult, result);
    }
    * */    
  
     /**
     * Test of takeItem method, of class Game.
     * Test print long description
     */
    @Test
    public void testTakeItemLongDescription() {
        System.out.println("takeItem Long Description");
        Command command = new Command("take","key");
        Game instance = new Game();
        instance.takeItem(command);
        assertEquals("You are at the castle.\nExits: east south.\nYou have some items: excaliburSword", instance.s);
    }
    
}
