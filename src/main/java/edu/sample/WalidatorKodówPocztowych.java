package edu.sample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WalidatorKodówPocztowych {

    public static boolean walidator(String kod) {
        if(kod==null){return false;}
        return Pattern.matches("[0-9]{2}-[0-9]{3}", kod);
    }
}
