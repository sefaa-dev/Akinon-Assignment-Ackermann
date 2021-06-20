package com.sefayilmaz.ackermanfunction;

import java.util.Scanner;

public class Main {
    /*
        A(m,n) = n+1                  if m=0
               =A(m-1, 1)             if m>0 and n=0
               =A(m-1, A(m, n-1))     if m>0 and n>0
*/

    static Scanner scanner = new Scanner(System.in);
    static int Ackermann(int m,int n){
        if (m==0){
            return n+1;
        }else if (m>0 && n==0){
            return Ackermann(m-1, 1);
        }else if (m>0 && n>0){
            return Ackermann(m-1,Ackermann(m, n-1));
        }else{
            return n+1;
        }
    }
    public static void main(String[] args){
        int m,n;
        System.out.println("m değerini giriniz:");
        m = scanner.nextInt();
        System.out.println("n değerini giriniz: ");
        n = scanner.nextInt();

        System.out.println("Ackermann Fonksiyonu Sonucu:" + Ackermann(m,n));
    }
    }

