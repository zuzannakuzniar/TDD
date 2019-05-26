package edu.sample;

import org.junit.jupiter.api.Test;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class WorkDayHelperTest {

    @Test
    public void testIsWorkingDay(){
        LocalDate lastDayOfMay = LocalDate.of(2019,05,31);
        boolean result = true;
        assertEquals(result,WorkDayHelper.isWorkingDay(lastDayOfMay));
    }

    @Test
    public void testIsWorkingDay2(){
        LocalDate lastDayOfJune = LocalDate.of(2019,06,28);
        boolean result = true;
        assertEquals(result,WorkDayHelper.isWorkingDay(lastDayOfJune));
    }


    @Test
    public void testLastDay(){
        LocalDate today = LocalDate.of(2019,05,26);
        LocalDate lastDayOfMay = LocalDate.of(2019,05,31);
        assertEquals(lastDayOfMay,WorkDayHelper.getLastDay(today));
    }

    @Test
    public void testLastDay1(){
        LocalDate today = LocalDate.of(2019,04,23);
        LocalDate lastDayOfApril = LocalDate.of(2019,04,30);
        assertEquals(lastDayOfApril,WorkDayHelper.getLastDay(today));
    }

    @Test
    public void testLastDay2(){
        LocalDate today = LocalDate.of(2019,06,23);
        LocalDate lastDayOfJune = LocalDate.of(2019,06,28);
        assertEquals(lastDayOfJune,WorkDayHelper.getLastDay(today));
    }



}