package edu.sample;

import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

public class WorkDayHelper {

    public static LocalDate getLastDay (LocalDate data) {

        LocalDate lastDayofCurrentMonth =  data.with(TemporalAdjusters.lastDayOfMonth());

        while (!isWorkingDay(lastDayofCurrentMonth)) {
            lastDayofCurrentMonth = lastDayofCurrentMonth.minusDays(1);
        }
        return lastDayofCurrentMonth;
    }


    public static boolean isWorkingDay(LocalDate lastDay) {

        return !(DayOfWeek.SATURDAY.equals(lastDay.getDayOfWeek()) || DayOfWeek.SUNDAY.equals(lastDay.getDayOfWeek()));
    }
}
