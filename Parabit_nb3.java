/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parabit_nb3;

import java.util.Scanner;

/**
 *
 * @author ramla
 */
public class Parabit_nb3 {

    public static void main(String[] args) {
       int a, b, c;
        Scanner ob = new Scanner(System.in);
        System.out.println(" Enter the first number");
        a=ob.nextInt();
        System.out.println("Enter the second number ");
        b=ob.nextInt();
        c=a+b;
        System.out.println("Sum of two number: "+c);
    }
}
