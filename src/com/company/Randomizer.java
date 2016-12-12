package com.company;

/**
 * Created by User on 09.12.2016.
 */
public class Randomizer {
    int Randomizer(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
