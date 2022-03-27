package ru.netology.sqr;

public class SQRService {
    public int calculateSQR(int minNumber, int maxNumber) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= minNumber && sqr <= maxNumber) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}
