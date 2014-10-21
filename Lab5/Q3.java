/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alif
 */
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
public class Q3 {
    
    public static void main(String[] args){
        Random random = new Random();
        ArrayList<int[]> al = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[20];
        int search;
       
      
        for(int i=0;i<number.length;i++){
            number[i] = random.nextInt(101);
        }
        
        for(int i=0;i<number.length;i++){
            System.out.print(number[i] + " ");
        }
        
        System.out.println("");
        
        for(int x = 0;x<number.length;x++ ){
            for(int i=0;i<number.length-1;i++){
            if(number[i]<number[i+1]){
                int temp = number[i];
                number[i] = number[i+1];
                number[i+1] = temp;
                }
            }
        }
        

        for(int i=0;i<number.length;i++){
            System.out.print(number[i] + " ");
        }
        
        System.out.println("");
        System.out.println("Search ? : ");
        search = scanner.nextInt();
        LinearSearch(search,number);
        BinarySearch(search,number,0,number.length-1,0);
    }
    
    public static void LinearSearch(int search, int[] arr){
        for(int i=0; i<arr.length;i++){
            if(arr[i]==search){
                System.out.println("Linear search : " +(i+1) + " loop(s)");
                break;
            }
        }
        
    
    }
    
    public static void BinarySearch(int search, int[] arr, int min, int max,int loop){
      int mid;
      max = max-1;
        if(max%2==0)mid=max/2;
        else mid=(max+1)/2;

      loop++;
        System.out.println("Mid : " + mid);
      if(search>arr[mid]){
          max = mid-1;
          System.out.println("Upper");
          BinarySearch(search,arr,min,max,loop);//upper
      } 
      else if(search<arr[mid]){
          min = mid+1;
          System.out.println("Lower");
          BinarySearch(search,arr,min,max,loop);//lower
      } 
      else System.out.println("Mid: " + mid + " Loop: " + loop); 
    }
    
}

//debug  BinarySearch please
