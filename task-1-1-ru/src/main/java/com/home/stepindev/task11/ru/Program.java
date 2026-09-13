/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.home.stepindev.task11.ru;
import java.io.*;

/**
 *
 * @author PC
 */
public class Program
{
    public static void main(String[] args) throws Exception
    {
        /*Ввод данных*/
        var stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество блоков");
        var n = Integer.parseInt(stdin.readLine());
        System.out.println("Введите количество блоков на башню");
        var k = Integer.parseInt(stdin.readLine());
        var t = n / k; // Максимальное количество башен
        var b = t * k; // Количесво блоков
        /*Вывод информации на экран*/
        System.out.printf
        (
            "Из %d блоков можно построить максимум %d башен(ни)\r\n",
            n,t
        );
        System.out.printf("На это уйдёт %d блоков.\r\n",b);
    }
}
