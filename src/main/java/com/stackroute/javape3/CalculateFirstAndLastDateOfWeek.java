package com.stackroute.javape3;
import java.util.*;
import java.text.*;

public class CalculateFirstAndLastDateOfWeek {

        public String calculateFirstAndLastDateOfWeek(){
            String output="";
            // Get calendar set to current date and time
            Calendar calendar = Calendar.getInstance();

            // Set the calendar to monday of the current week
            calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

            // Print dates of the current week starting on Monday
            DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");

            output=output+ df.format(calendar.getTime());
            output=output+"\n";
            for (int i = 0; i <6; i++) {
                calendar.add(Calendar.DATE, 1);
            }
            output=output+ df.format(calendar.getTime());

            return output;
        }
}
