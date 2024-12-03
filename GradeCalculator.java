// This program calculates the grade of students 

import java.util.Scanner;
public class GradeCalculator {    
    public GradeCalculator() {
        double totalMark = 0;
        String grade;

        // Prompt the user to enter the marks of the eight subjects and calculate the total mark
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many courses are you taking?");
        int numberOfCourses = scanner.nextInt();
        int[] mark = new int[numberOfCourses];

        // Taking the marks of the subjects
        System.out.println("Enter the mark you obtained out of 100 for the " + numberOfCourses + " courses one by one.");
        for (int i = 0; i < numberOfCourses; i++){
            mark[i] = scanner.nextInt();
        }
        scanner.close();
        
        // Calculating the total mark the student obtained out of 800
        for (int i = 0; i < mark.length; i++){
            totalMark += mark[i];
        }
        // System.out.println("The total mark the student obtained out of 800 is " + totalMark);

        // calculating the average percentage of the mark of the student
        double averagePercentage = totalMark/numberOfCourses;

        // Assigning grades based on the averagePercentage
        if(averagePercentage >= 97 && averagePercentage <= 100)
            grade = "A+";
        else if (averagePercentage >= 93 && averagePercentage <= 96)
            grade = "A";
        else if (averagePercentage >= 90 && averagePercentage <= 92)
            grade = "A-";
        else if (averagePercentage >= 87 && averagePercentage <= 89)
            grade = "B+";
        else if (averagePercentage >= 83 && averagePercentage <= 86)
            grade = "B";
        else if (averagePercentage >= 80 && averagePercentage <= 82)
            grade = "B-";
        else if (averagePercentage >= 77 && averagePercentage <= 79)
            grade = "C+";
        else if (averagePercentage >= 73 && averagePercentage <= 76)
            grade = "C";
        else if (averagePercentage >= 70 && averagePercentage <= 72)
            grade = "C-";
        else if (averagePercentage >= 67 && averagePercentage <= 69)
            grade = "D+";
        else if (averagePercentage >= 63 && averagePercentage <= 66)
            grade = "D";
        else if (averagePercentage >= 60 && averagePercentage <= 62)
            grade = "D-";
        else 
            grade = "F";
        
        // Displaying the total mark of the student
        System.out.println("The total mark you obtained out of " + numberOfCourses*100 +" is " + totalMark);
        
        // Displaying the average percentage of the mark of the student
        System.out.println("The average percentage of your mark is " + averagePercentage);
        
        // Displaying the grade of the student
        System.out.println("Your grade is " + grade);


    }
    public static void main(String[] args) {
        new GradeCalculator();
    }
}
