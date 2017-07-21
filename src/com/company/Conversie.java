package com.company;

/**
 * Created by ramonaboariu on 7/19/2017.
 */
public class Conversie {
    public float convertToCelsius(float fDegree) {
        float tempC;
        tempC = (5 * (fDegree - 32) / 9);
        return tempC;
    }
}