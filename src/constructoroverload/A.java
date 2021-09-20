/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructoroverload;

/**
 *
 * @author Abdul Moiz Chishti
 */
public class A {
   
    private String name = "moiz";
    
   public A(int num){
         for (int i=1;i<=10;i++){
//        System.out.println(num+" x "+i+" = "+(i*num));
        System.out.println("Name: "+name);
    }
    }
    
    
    public void displayName(){
        System.out.println("Name: "+name);
    }
    
    
}
