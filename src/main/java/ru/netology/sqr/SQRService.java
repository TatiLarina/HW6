package ru.netology.sqr;

public class SQRService {

    public int calcSQR(int x, int y) {
        int count = 0;
        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }
        for (int i = 10; i <= 99; i++) {
            if ((i * i >= x) & (i * i <= y)) {
                count++;
                if (i * i > y) {
                    return count;
                }
            }
        }
        return count;
    }

}
