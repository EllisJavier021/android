package com.example.ahmedbmicalculator;

import android.os.Build;

import androidx.annotation.RequiresApi;

public class BMI {
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public static String BMICalc(String name, double height, double weight){
        double bmi = (weight/Math.pow(height, 2))*703;
        String choice = " ";
        if(bmi<=18.5){
            choice = "You are considered overweight";
        }
        else if(bmi>18.5 && bmi<24.9){
            choice = "You are considered healthy";
        }
        else if(bmi>=25 && bmi<=29.9){
            choice = "You are considered overweight";
        }
        else if(bmi>=30){
            choice = "Dammmn, You are obese";
        }
        bmi = (double)Math.round(bmi * 100d) / 100d; //rounds to hundredth decimal place
        return name + "'s BMI Report " + System.lineSeparator() + "Your BMI is " + bmi + System.lineSeparator() + choice;
    }
}
