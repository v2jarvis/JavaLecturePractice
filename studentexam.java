/*import java.util.Scanner;

public class studentexam
{
    public static void main(String args[]) {
        final int student = 5;
        Scanner sc = new Scanner(System.in);

        int rollNo[] = new int[student];
        int sA[] = new int[student];
        int sB[] = new int[student];
        int sC[] = new int[student];
        double avg[] = new double[student];

        for (int i = 0; i < student; i++) {
            System.out.println("Enter student " + (i+1) + " details:");
            System.out.print("Roll No: ");
            rollNo[i] = sc.nextInt();
            System.out.print("Subject A Marks: ");
            sA[i] = sc.nextInt();
            System.out.print("Subject B Marks: ");
            sB[i] = sc.nextInt();
            System.out.print("Subject C Marks: ");
            sC[i] = sc.nextInt();
            avg[i] = (sA[i] + sB[i] + sC[i]) / 3.0;
        }

        System.out.println("\nRoll No\tAverage Marks");
        for (int i = 0; i < student; i++) {
            System.out.println(rollNo[i] + "\t" + avg[i]);
        }

        System.out.println("\nStudents with Average above 80:");
        for (int i = 0; i < student; i++) {
            if (avg[i] > 80)
                System.out.println(rollNo[i] + "\t" + avg[i]);
        }

        System.out.println("\nStudents with Average below 40:");
        for (int i = 0; i < student; i++) {
            if (avg[i] < 40)
                System.out.println(rollNo[i] + "\t" + avg[i]);
        }
    }
}*/