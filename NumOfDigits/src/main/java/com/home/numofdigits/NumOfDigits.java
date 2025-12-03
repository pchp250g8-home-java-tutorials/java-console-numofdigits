/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.home.numofdigits;
import java.io.*;

/**
 *
 * @author PC
 */
public class NumOfDigits 
{
    public static void main(String[] args)
    {
        System.out.println("Input an Integer number:");
        try
        {
            var bufStdIn = new BufferedReader(new InputStreamReader(System.in));
            var strNum = bufStdIn.readLine();
            var iNum = Long.parseLong(strNum);
            var iVal = Math.abs(iNum);
            var nDigits = 0;
            while(iVal > 0)
            {
                iVal /= 10;
                nDigits++;
            }
            System.out.printf("The number %d has %d digit(s)\r\n", iNum,nDigits);
        }
        catch(Exception ex)
        {
            System.out.println("Convertion Number Error. No Result.");
        }
    }
}
