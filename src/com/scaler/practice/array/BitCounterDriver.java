package com.scaler.practice.array;

/**
 * This class will be used to Calculate no.of "1" bits in binary equivalent of a decimal number
 * @author Velmurugan Moorthy
 * 23.07.2021
 */
public class BitCounterDriver {
    public static void main(String[] args) {
        BitCounter bitCounter = new BitCounter();
        bitCounter.countBits(4);
    }
}

class BitCounter{
    public int countBits(int input){
        System.out.println("Input number is : " + input);
        if(input == 1 || input == 2){
            return 1;
        }

        if(input == 3){
            return 2;
        }

        int remainder = input % 2;
        int quotient = input / 2;
        int number = 0;
        int bitCount = 0;
        System.out.println("Remainder : " + remainder + " | quotient : " + quotient);

        while(quotient > 1){
            if(remainder == 1){
                bitCount++;
            }
            number = quotient;
            remainder = number % 2;
            quotient = number / 2;
        }

        if(remainder == 1){
            bitCount++;
        }
        if(quotient == 1){
            bitCount++;
        }

        return bitCount;
    }
}
