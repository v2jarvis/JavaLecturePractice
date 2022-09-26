/*import java.util.Scanner;
public class Student1
{
    String name;
    int age, m1, m2, m3 = 0;
    double max;
    float avg;

public void accept()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Name of Student: ");
    name = sc.nextLine();
    System.out.println("Enter The age of Student: ");
    age = sc.nextInt();
    System.out.println("Enter Subject 1 Marks: ");
    m1 = sc.nextInt();
    System.out.println("Enter Subject 2 Marks: ");
    m2 = sc.nextInt();
    System.out.println("Enter Subject 3 Marks: ");
    m3 = sc.nextInt();
}
public void compute()
{
    if (m1>m2 && m1>m3)
        max=m1;
    else if (m2>m1 && m2>m3)
        max=m2;
    else
        max=m3;

    avg = (m1+m2+m3)/3;
}
public void display()
{
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Subject 1 Marks: " +m1);
        System.out.println("Subject 2 Marks: " +m2);
        System.out.println("Subject 3 Marks: " +m3);
        System.out.println("Maximum Marks: " +max);
        System.out.println("Average Marks: " +avg);
}

    public static void main(String args[])
    {
        Student1 obj = new Student1();
        obj.accept();
        obj.compute();
        obj.display();
    }
}*/
