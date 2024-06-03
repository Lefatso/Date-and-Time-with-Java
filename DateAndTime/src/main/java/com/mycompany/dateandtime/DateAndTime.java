/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dateandtime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

/**
 *
 * @author Admin
 */
public class DateAndTime {

    public static void main(String[] args) {
         LocalDate dateObj = LocalDate.now();
         LocalTime timeObj = LocalTime.now();
         LocalDateTime dateTimeObj = LocalDateTime.now();
         
         System.out.println("The current date is : " + dateObj);
         System.out.println("The current time : " +  timeObj);
         System.out.println("The current date and time : " + dateTimeObj);
    }
}
