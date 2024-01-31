import java.util.*;

public class Ass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome! This program will help you calculate total marks, average, and grade obtained.");
        System.out.print("Enter the number of subjects: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the marks of subject " + (i + 1) + " out of 100: ");
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        System.out.println("Total sum: " + sum);

        // Use floating-point division to get accurate average
        float avg = sum / (float) size;
        System.out.println("Average: " + avg);

        String grade;

        if (avg > 90) {
            grade = "A+";
        } else if (avg > 85) {
            grade = "A";
        } else if (avg > 80) {
            grade = "B+";
        } else if (avg > 70) {
            grade = "B";
        } else if (avg > 60) {
            grade = "C+";
        } else if (avg > 50) {
            grade = "C";
        } else if(avg>35) {
            grade = "D";
        }
        else{
            grade="F";
        }

        System.out.println("Grade: " + grade);
    }
}