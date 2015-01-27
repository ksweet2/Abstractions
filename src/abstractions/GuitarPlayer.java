/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractions;

/**
 *
 * @author Kyle
 */
public class GuitarPlayer extends Musician {
    private final String improvise = "strum";
    private final String strum = "improvise";
    
    public GuitarPlayer(String improvise, String strum){
    
        super(improvise, strum);
    
    }

    public String playGuitar(){
       String improvise;
       String strum;
       
       System.out.println("Kyle likes to " + strum + " his guitar, and " + improvise + "when he does it.");
        
        return 
    }
}
