/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcontroldemo;

/**
 *
 * @author PMPAdmin
 */
public class Dispatcher {
  
    private EndgameReview Endgame;
    private AladdinReview Aladdin;
    private ToyStory4Review ToyStory4;
    
    public Dispatcher()
    {
        Endgame = new EndgameReview();
        Aladdin = new AladdinReview();
        ToyStory4 = new ToyStory4Review();   
    }
    public void dispatch ( String request )
    {
        if( request.equalsIgnoreCase("Endgame"))
        {
            Endgame.show();
        }
        else if( request.equalsIgnoreCase("Aladdin") )
        {
            Aladdin.show();
        }
        else
        {
            ToyStory4.show();
        }
    }         
}
