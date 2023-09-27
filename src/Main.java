import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name1;
        String name2;
        String name3;
        String name4;

        int mark1One;
        int mark2One;
        int mark3One;

        int mark1Two;
        int mark2Two;
        int mark3Two;

        int mark1Three;
        int mark2Three;
        int mark3Three;

        int mark1Four;
        int mark2Four;
        int mark3Four;

        System.out.print("Enter name for student1: ");
        name1 = input.nextLine();
        System.out.print("Enter name for student2: ");
        name2 = input.nextLine();
        System.out.print("Enter name for student3: ");
        name3 = input.nextLine();
        System.out.print("Enter name for student4: ");
        name4 = input.nextLine();

        System.out.println("Enter mark one");
        mark1One = input.nextInt();
        mark1Two = input.nextInt();
        mark1Three = input.nextInt();
        mark1Four = input.nextInt();

        System.out.println("Enter mark two");
        mark2One = input.nextInt();
        mark2Two = input.nextInt();
        mark2Three = input.nextInt();
        mark2Four = input.nextInt();

        System.out.println("Enter mark three");
        mark3One = input.nextInt();
        mark3Two = input.nextInt();
        mark3Three = input.nextInt();
        mark3Four = input.nextInt();

        String result1 = "";
        String result2 = "";
        String result3 = "";
        String result4 = "";

        String grade1 = "";
        String grade2 = "";
        String grade3 = "";
        String grade4 = "";

        int total1 = mark1One + mark2One + mark3One;
        int total2 = mark1Two + mark2Two + mark3Two;
        int total3 = mark1Three + mark2Three + mark2Three;
        int total4 = mark1Four + mark2Four + mark3Four;

        float avg1 = (float) total1 / 3;
        float avg2 = (float) total2 / 3;
        float avg3 = (float) total3 / 3;
        float avg4 = (float) total4 / 3;

        //Grade calculation for student 1
        if (avg1 >= 40)
        {
            result1 = "P";
        }
        else {
            result1 = "F";
        }
        if (avg1 >= 80 && avg1 <= 100)
        {
            grade1 = "A";
        }
        else if (avg1 >= 75 && avg1 <= 79.9)
        {
            grade1 = "B+";
        }
        else if (avg1 >= 65 && avg1 <= 74.9)
        {
            grade1 = "B";
        }
        else if (avg1 >= 55 && avg1 <= 64.9)
        {
            grade1 = "C+";
        }
        else if (avg1 >= 50 && avg1 <= 54.9)
        {
            grade1 = "C";
        }
        else if (avg1 >= 40 && avg1 <= 49.9)
        {
            grade1 = "D";
        }
        else {
            grade1 = "F";
        }

        //Grade calculation for student two

        if (avg2 >= 40)
        {
            result2 = "P";
        }
        else {
            result2 = "F";
        }
        if (avg2 >= 80 && avg2 <= 100)
        {
            grade2 = "A";
        }
        else if (avg2 >= 75 && avg2 <= 79.9)
        {
            grade2 = "B+";
        }
        else if (avg2 >= 65 && avg2 <= 74.9)
        {
            grade2 = "B";
        }
        else if (avg2 >= 55 && avg2 <= 64.9)
        {
            grade2 = "C+";
        }
        else if (avg2 >= 50 && avg2 <= 54.9)
        {
            grade2 = "C";
        }
        else if (avg2 >= 40 && avg2 <= 49.9)
        {
            grade2 = "D";
        }
        else {
            grade2 = "F";
        }

        //Grade calculation for student 3

        if (avg3 >= 40)
        {
            result3 = "P";
        }
        else {
            result3 = "F";
        }
        if (avg3 >= 80 && avg3 <= 100)
        {
            grade3 = "A";
        }
        else if (avg3 >= 75 && avg3 <= 79.9)
        {
            grade3 = "B+";
        }
        else if (avg3 >= 65 && avg3 <= 74.9)
        {
            grade3 = "B";
        }
        else if (avg3 >= 55 && avg3 <= 64.9)
        {
            grade3 = "C+";
        }
        else if (avg3 >= 50 && avg3 <= 54.9)
        {
            grade3 = "C";
        }
        else if (avg3 >= 40 && avg3 <= 49.9)
        {
            grade3 = "D";
        }
        else {
            grade3 = "F";
        }

        //Grade calculation for student 4
        if (avg4 >= 40)
        {
            result4 = "P";
        }
        else {
            result4 = "F";
        }
        if (avg4 >= 80 && avg4 <= 100)
        {
            grade4 = "A";
        }
        else if (avg4 >= 75 && avg4 <= 79.9)
        {
            grade4 = "B+";
        }
        else if (avg4 >= 65 && avg4 <= 74.9)
        {
            grade4 = "B";
        }
        else if (avg4 >= 55 && avg4 <= 64.9)
        {
            grade4 = "C+";
        }
        else if (avg4 >= 50 && avg4 <= 54.9)
        {
            grade4 = "C";
        }
        else if (avg4 >= 40 && avg4 <= 49.9)
        {
            grade4 = "D";
        }
        else {
            grade4 = "F";
        }


        System.out.println("*******************************************************");
        System.out.println("                      STUDENT MARKLIST");
        System.out.println("*******************************************************");
        System.out.println("ROLL    NAME   MARK1 MARK2 MARK3 TOTAL RESULT Average GRADE");
        System.out.println("101     " + name1 + "   " + mark1One + "    " + mark2One + "    " + mark3One + "    " + total1 + "    " + result1 + "    " + Math.floor(avg1) + "    " + grade1);
        System.out.println("102     " + name2 + "   " + mark1Two + "    " + mark2Two + "    " + mark3Two + "    " + total2 + "    " + result2 + "    " + Math.floor(avg2) + "    " + grade2);
        System.out.println("103     " + name3 + "   " + mark1Three + "    " + mark2Three + "    " + mark3Three + "    " + total3 + "    " + result3 + "    " + Math.floor(avg3) + "    " + grade3);
        System.out.println("104     " + name4 + "    " + mark1Four + "    " + mark2Four + "    " + mark3Four + "    " + total4 + "    " + result4 + "    " + Math.floor(avg4) + "    " + grade4);
    }
}