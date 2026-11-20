package com.plurasight;

public class TestStatistics {
    public static void main(String[] args) {
        int[] scores = {70, 80, 90, 85, 95, 75, 88, 92, 78, 87};

        int total = 0;
        int highScore = scores[0];
        int lowScore = scores[0];

        for (int score : scores) {
            total += score;

            if (score > highScore) {
                highScore = score;
            }

            if (score < lowScore) {
                lowScore = score;
            }
        }

        double average = (double) total / scores.length;

        System.out.printf("Average: %.2f%n", average);
        System.out.println("High score: " + highScore);
        System.out.println("Low score: " + lowScore);
    }
}