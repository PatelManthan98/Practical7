import java.util.ArrayList;
import java.util.Scanner;
class Accountholder{
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    int we;
    double inc;
    Boolean czs;
    static void P3() {
        System.out.println(":: To Apply For Job Fill the Form ::");
    }
    void info() {
        System.out.println("Enter Your Name : ");
        name = sc.next();
        System.out.println("Enter Your Age : ");
        age = sc.nextInt();
        System.out.println("Enter Your Net Monthly Income : ");
        inc = sc.nextDouble();
        System.out.println("Enter Your Total Work Experince (In Year Format): ");
        we = sc.nextInt();
        System.out.println("What is Your CitizenShip? (For Indian true otherwisw false) :- ");
        czs = sc.nextBoolean();
    }
    void check() {
        if (age >= 21 && age <= 60) {
            System.out.println("Your Age is : " + age);
        } else if (inc >= 15000) {
            System.out.println("Your Monthly Income is : " + inc);
        } else if (we >= 1) {
            System.out.println("Your Work Experience is : " + we);
        } else if (czs == true) {
            System.out.println("You Are A Indian Citizenship ......");
        }
    }

}
public class P3 {
    public static void main(String[] args) {
        int count = 0;
        ArrayList a = new ArrayList<>();
        ArrayList<Accountholder> personHolder = new
                ArrayList<Accountholder>();
        Accountholder.P3();
        for (int i = 1; i <= 5; i++) {personHolder.add(new Accountholder());
        }
        for (Accountholder p : personHolder) {
            p.info();
            p.check();
            if (p.age >= 21 && p.age <= 60 && p.inc >= 15000 && p.we >= 1 && p.czs == true)
            {
                System.out.println("You are Elligeble**");
                System.out.println("Your Name is : " + p.name);
                count++;
                a.add(p.name);
            } else {
                System.out.println("You Are Not Elligeble!!!");
            }
        }
        System.out.println("The Number of Elligeble Candidates : " + count);
        System.out.println("The Number of Not Elligeble Candidates : " + (5 - count));
        System.out.println("All Eligible Candidates Are : " + a);

    }
}
