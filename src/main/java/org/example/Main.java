package org.example;
import java.util.Scanner;
public class Main {
    public static boolean Leap(int year){
        if(year%4==0 || year%400==0){
            return true;

        }
        else{
            return false;
        }

    }
    public static void main(String[] args){
        
        if(Leap(1000)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
