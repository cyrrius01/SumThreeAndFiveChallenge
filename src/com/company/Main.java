package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        int runningTotal = 0;
        for(int i=1;i<1001;i++) {
            if((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                runningTotal += i;
                System.out.println(i + " can be divided by 3 and 5");
                if(count == 5){
                    break;
                }
            }
        }

        System.out.println("The sum of the above numbers is: " + runningTotal);

    }
}
