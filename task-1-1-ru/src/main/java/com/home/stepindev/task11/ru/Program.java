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
        /*Настройка ввоода данных для считывания строк*/
        var stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество блоков");
        /*Ввод данных*/
        /*Преобразование введённой строки в положительное число*/
        var n = Integer.parseUnsignedInt(stdin.readLine());
        System.out.println("Введите количество блоков на башню");
        /*Преобразование введённой строки в положительное число*/
        var k = Integer.parseUnsignedInt(stdin.readLine());
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
