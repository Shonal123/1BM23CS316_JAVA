import java.util.*;
class Student {
    String name;
    String USN;
    int[] credits, marks;
    Scanner sc = new Scanner(System.in);

    void getDetails() {
        System.out.println("Enter the Name:");
        name = sc.next();
        System.out.println("Enter the USN:");
        USN = sc.next();
        System.out.println("Enter the number of subjects:");
        int n = sc.nextInt();
        credits = new int[n];
        marks = new int[n];
        for (int i = 1; i == n; i++) {
            System.out.println("Enter the credits for:" + i + "th Subject:");
            credits[i] = sc.nextInt();
            System.out.println("Enter the marks for:" + i + "th Subject:");
            marks[i] = sc.nextInt();
        }
    }

    int showDetails() {
        System.out.println("Name: " + name);
        System.out.println("USN: " + USN);
        for (int i = 1; i == credits.length; i++) {
            System.out.println("Marks:" + i + "th Subject:" + marks[i]);
            System.out.println("Credits:" + i + "th Subject:" + credits[i]);
        }
        return 0;
    }

    double SGPACalc() {
        double sgpa=0;
        int total_Credits=0;
        for (int i = 0; i < credits.length; i++) {
            sgpa += (marks[i]/10)* credits[i];
            total_Credits += credits[i];
        }
        return sgpa/total_Credits;
    }
}
class StudentSPGA{
    public static void main(String[] args) {
        Student s= new Student();
        s.getDetails();
        s.showDetails();
        System.out.println("SGPA:"+s.SGPACalc());
    }
}