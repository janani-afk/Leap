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
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(Leap(year)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
