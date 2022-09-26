/*import java.util.Scanner;
public class hotel {
    int Rno, Nod;
    String Name;
    float Tarrif;

    Scanner sc = new Scanner(System.in);


    public double Calc()
    {
        if ((Nod*Tarrif)>10000)
            return(1.05*Nod*Tarrif);
        else
            return(Nod*Tarrif);

    }

    public void CheckIn()
    {
        System.out.println("Enter The Room No:");
        Rno = sc.nextInt();
        System.out.println("Enter The Name:");
        sc.nextLine();
        Name = sc.nextLine();
        System.out.println("Enter The Tarrif:");
        Tarrif = sc.nextFloat();
        System.out.println("Enter The No. of Days:");
        Nod = sc.nextInt();
    }

    public void CheckOut() {
        System.out.println("Room No:" + Rno);
        System.out.println("Name:" + Name);
        System.out.println("Tarrif:" + Tarrif);
        System.out.println("No. of Days:" + Nod);
        System.out.println("Amount:"+Calc());

    }

    public static void main(String args[])
    {
        hotel obj = new hotel();
        obj.Calc();
        obj.CheckIn();
        obj.CheckOut();
    }
}*/