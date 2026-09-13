/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.home.stepindev.task11.en;
import java.io.*;
/**
 *
 * @author PC
 */
public class Program 
{
    public static void main(String[] args) throws Exception
    {
        // Input Data
        var oStdIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of blocks");
        var n = Integer.parseInt(oStdIn.readLine());
        System.out.println("Enter the number of towers");
        var k = Integer.parseInt(oStdIn.readLine());
        var t = n / k; // Maximum number of towers
        var b = t * k; // Number of blocks
        // Print information to display
        System.out.printf
        (
            "From %d blocks, you can build a maximum of %d towers\r\n",
            n,t
        );
        System.out.printf("This will take %d blocks.\r\n",b);
    }
}
