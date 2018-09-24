
//Mai to review again 9/24/18

package com.company;

import java.util.Random;
//This program should generate 10 random integers from 1 to 6. Fix it so that it works...
//That'll pick a random number from 1 to 10 (inclusive) and store it into the variable x.

import java.util.Random;
public class RandomnessDebugging {

    public static void main(String[] args) {
	// write your code here
        output("Generate 10 random integers between 0 and 6");

        Random rnd = new Random(); //declare variable of type Random = rnd; (standard Random)

        for (int x = 1; x <= 10; ++x)
        {

           int randomInt = 1 + rnd.nextInt(6);  //then stores = first Generates  (standard Random)
            output("Generated number: " + randomInt);
        }

        output("Done.");
    }

    private static void output(String aMessage)
    {
        System.out.println(aMessage);
    }
}
