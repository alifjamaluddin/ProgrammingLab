/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alif
 */


public class Q4 {
    public static void main(String args[]){
        
        
        double moneyget = 3.10;
        double fiftycent, twentycent, tencent, onecent;
        
       double money = moneyget;
        
        fiftycent = money/0.50;
        money = money%0.50;
        
        System.out.println(money);
        
        twentycent = money/0.20;
        money = money%0.20;
        System.out.println(money);
                    
        tencent = money/0.10;
        money = money%0.10;
        System.out.println(money);
                
        onecent = money/0.01;
        money = money%0.01;
        System.out.println(money);
        System.out.printf("RM %.2f is equal to %.0f 50cent, %.0f 20cent, %.0f 10cent, %.0f 1cent %n", moneyget, fiftycent, twentycent, tencent, onecent, money);
               
    }
}
