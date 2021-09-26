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
    
    @Test
    public void testTakeItemLongDescription() {
        System.out.println("takeItem Long Description");
        Command command = new Command("take","key");
        Game instance = new Game();
        instance.takeItem(command);
        assertEquals("You are at the castle.\nExits: east south.\nYou have some items: excaliburSword", instance.s);
    }
     */
    
    /**
     * /**
     * Test of dropItem method, of class Game.
     * T
    @Test
    public void testDropItemLongDescription() {
        System.out.println("dropItem Long Description");
        Command command = new Command("take","key");
        Command command2 = new Command("drop","key");

        Game instance = new Game();
        instance.takeItem(command);
        instance.dropItem(command2);
        assertEquals("You are at the castle.\nExits: east south.\nYou have some items: excaliburSword key", instance.s1);
    }
    */
    
    
    
    
    /**
     * Test of Use command, of class Game.
     */
    /*
    @Test
    public void testUseCommand() {
        System.out.println("Use command without second word");
        Command command = new Command("use","");
        boolean expResult = false;
        boolean result = !command.hasSecondWord();
        assertEquals(expResult, result);
    }
    */
    
    /**
     * Test when player use the key and door should unlock
     */
    
    @Test
    public void testRoomUnlock() {
        System.out.println("Test room unlock after use command");
        Command takeKey = new Command("take","frontGateKey");
        Command useKey = new Command("use","frontGateKey");
        Command goCommand = new Command("go","east");
        Command goCommand1 = new Command("go","west");
        Command goCommand2 = new Command("go","south");
        Command goCommand3 = new Command("go","north");
        Game instance = new Game();
        
        //Go east direction to Kitchen
        instance.goRoom(goCommand);
        
        //Take frontGateKey in the kitchen
        instance.takeItem(takeKey);
        
        //Go west direction to Castle
        instance.goRoom(goCommand1);
        
        //Go south direction to frontGate
        instance.goRoom(goCommand2);
        
        //Try go back to castle (but the room is locked)
        instance.goRoom(goCommand3);
        
        //use frontGateKey to unlock to go back to the castle
        instance.useItem(useKey);
        
        //The door is unlocked and able to go back to the castle
        instance.goRoom(goCommand3);
        
        boolean expResult = false;
        boolean result = instance.TestLockVal;
        assertEquals(expResult, result);
        
    }
    
    
    
}
