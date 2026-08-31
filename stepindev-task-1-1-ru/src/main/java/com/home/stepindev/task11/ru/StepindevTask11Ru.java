/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.home.stepindev.task11.ru;
import java.io.*;
import java.nio.charset.Charset;

/**
 *
 * @author PC
 */
public class StepindevTask11Ru 
{

    public static void main(String[] args) throws Exception
    {
        var strCodeName = Charset.defaultCharset().displayName();
        var oStdIn = new BufferedReader(new InputStreamReader(System.in, strCodeName));
        var oStdOut = new PrintWriter(new OutputStreamWriter(System.out,strCodeName),true);
        oStdOut.println("Введите количество блоков");
        var n = Integer.parseInt(oStdIn.readLine());
        oStdOut.println("Введите количество блоков на башню");
        var k = Integer.parseInt(oStdIn.readLine());
        var t = n / k; // Максимальное количество башен
        var b = t * k; // Количесво блоков
        oStdOut.printf
        (
            "Из %d блоков можно построить максимум %d башен(ни)\r\n",
            n,t
        );
        oStdOut.printf("На это уйдёт %d блоков.\r\n",b);
    }
}
