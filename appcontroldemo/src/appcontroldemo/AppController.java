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
public class AppController 
{
 private Dispatcher dispatcher;
 
 public AppController()
 {
dispatcher = new Dispatcher();
}

private boolean isAuthenticUser()
{
System.out.println("User is authenticated successfully.");
return true;
}
private void trackRequest( String request )
{
System.out.println("Page requested: " +request);
}
public void dispatchRequest( String request )
{
    trackRequest(request);
    if( isAuthenticUser())
        
{
    dispatcher.dispatch(request);
    
}
}
}


