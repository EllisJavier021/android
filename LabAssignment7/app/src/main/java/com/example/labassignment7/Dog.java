package com.example.labassignment7;

import java.io.Serializable;

class Dog implements Serializable {
    static final String UNDERWEIGHT = "underweight";
    static final String HEALTHY = "healthy";
    static final String OVERWEIGHT = "overweight";
    static final String OBESE = "obese";

    static final String PUPPY = "puppy";
    static final String ADOLESCENT = "puppy";
    static final String ADULT = "puppy";
    static final String SENIOR = "puppy";

    int age;
    String name;
    String breed;
    float weight;
    float height;

    public Dog (final String n, final int a, final String b, final float w, final float h) {
        age = a;
        name = n;
        breed = b;
        weight = w;
        height = h;
    }

    public String bark() {

        return name + ": Woof! Woof!!";
    }

    public String growl() {
        return name + ": Grrr! Grrr!!";
    }

    public int ageinHumanYears() {
        // YOU MUST IMPLEMENT THIS METHOD
        int ha = 0;
        assert (ha > 0);
        if (age == 1) {
            ha = 15;
        }
        if (age == 2) {
            ha = 24;
        }
        if (age > 2) {
            ha = 24 + ((age - 2) * 5);
        }
        return ha;
    }

    public String ageCategory() {
        // YOU MUST IMPLEMENT THIS METHOD
        String cat = "";
        if (age <= 1) {
            cat = PUPPY;
        } else if (age > 1 && age < 4) {
            cat = ADOLESCENT;
        } else if (age >= 4 && age <= 10) {
            cat = ADULT;
        } else if (age > 10) {
            cat = SENIOR;
        } else {
            cat = "ERROR";
        }
        return cat;
    }

    public float wthRatio() {
        // YOU MUST IMPLEMENT THIS METHOD
        final float wth = weight / height;
        return wth;
    }

    public String wthCategory() {
        // YOU MUST IMPLEMENT THIS METHOD

        final float wth = wthRatio();
        if(wth <2 )
        {
            return UNDERWEIGHT;
        }
        else if(wth>=2 && wth<=3)
        {
            return HEALTHY;
        }
        else if(wth>3 && wth<=4)
        {
            return OVERWEIGHT;
        }
        else if(wth>4)
        {
            return OBESE;
        }
        else
        {
            return "ERROR";
        }
    }

    public String toString()
    {
        //YOU MUST IMPLEMENT THIS METHOD
        return name + " is a " + age + " years old " + breed + " " + ageCategory() +
                " who is " + ageinHumanYears() + " years old in human years. " + name +
                "'s BMI or WTH is " + wthRatio() + " and he is considered " + wthCategory() + ".";

    }
}
