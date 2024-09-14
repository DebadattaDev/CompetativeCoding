package org.example.recursion;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
public class DateCompare {

        public static void main (String[] args) throws ParseException {
            String date1String = "2023-02-03";
            String date2String = "2024-02-04";

            // Parse the date strings to LocalDate objects
            LocalDate date1 = LocalDate.parse(date1String);
            LocalDate date2 = LocalDate.parse(date2String);

            // Compare the dates using compareTo
            int comparisonResult = date1.compareTo(date2);

            // Print the result
            if (comparisonResult < 0) {
                System.out.println(date1 + " is before " + date2);
            } else if (comparisonResult > 0) {
                System.out.println(date1 + " is after " + date2);
            } else {
                System.out.println(date1 + " is equal to " + date2);
            }
        }
    }


