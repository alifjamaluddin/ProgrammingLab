/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author Alif
 */
public class Q2 {
    public static void main(String[] args){
        BankAccount ba = new BankAccount("Alif", "920810105421", 10000);
        ba.deposit(200);
        ba.withdraw(500);
        ba.display();
    }
}

class BankAccount{

    String name;
    String ic;
    int balance;
    
    BankAccount(){
        name = "";
        ic = "";
        balance = 0;
    }
    
    BankAccount(String a, String b, int c){
        name = a;
        ic = b;
        balance = c;
    }

    void deposit(int a){
        balance = balance + a;
    }
    
    void withdraw(int a){
        balance = balance - a;
    }
    
    void display(){
        System.out.println("Account name \t\t IC \t\t Current balance(RM) " );
        
        System.out.println(name +"\t\t\t"+ ic+ "\t\t" + balance );
    }
}
