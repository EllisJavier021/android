package com.example.weightconversion;

import java.text.DecimalFormat;

public class weightConvert {
    public static String pounds(double weight){
        double kg = weight*0.45359237;
        DecimalFormat dec = new DecimalFormat("#0.00");
        return "Your weight in kilograms is " + (dec.format(kg));
    }
}
