package ru.netology.sqr.lessonPackages.services;

public class SqrtService {
    public int calcSqrt(int x, int y) {
        int stall = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= x) {
                if (i * i <= y) {
                    stall++;
                }
            }
        }
        return stall;
    }
}