/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsexecutorsrunnables;

/**
 *
 * @author PMPAdmin
 */
public class RunnableTest implements Runnable {

          public static String runnableMaybe;
    public void test(){
        for(int grade=1;grade<=10;grade++){
            System.out.println(Thread.currentThread().getName()+"  "+ grade +" correct ");
            boolean ifPassed = this.ifPassed(grade);
            if(ifPassed){
                break;
            }
        }
    }
    private boolean ifPassed(int pass){
        boolean ifPassed = false;
        if((RunnableTest.runnableMaybe==null)&&(pass==10)){
            String passName=Thread.currentThread().getName();
            RunnableTest.runnableMaybe=passName;
            System.out.println("Nice Job!");
            ifPassed=true;
        }
        else if(RunnableTest.runnableMaybe==null){
            ifPassed=false;
        }
        else if(RunnableTest.runnableMaybe==null){
            ifPassed=true;
        }
        return ifPassed;
    }
    public void run(){
        this.test();
    }
}