/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsexecutorsrunnables;

/**
 *
 * @PMPAdmin
 */
public class RunnableExample implements Runnable {

          public static String runnable;
    public void test(){
        for(int grade=1;grade<=10;grade++){
            System.out.println(Thread.currentThread().getName()+" Question Number "+ grade +" Is Correct ");
            boolean ifPassed = this.ifPassed(grade);
            if(ifPassed){
                break;
            }
        }
    }
    private boolean ifPassed(int pass){
        boolean ifPassed = false;
        if((RunnableExample.runnable==null)&&(pass==10)){
            String passName=Thread.currentThread().getName();
            RunnableExample.runnable=passName;
            System.out.println("Great Job!!!");
            ifPassed=true;
        }
        else if(RunnableExample.runnable==null){
            ifPassed=false;
        }
        else if(RunnableExample.runnable==null){
            ifPassed=true;
        }
        return ifPassed;
    }
    public void run(){
        this.test();
    }
}