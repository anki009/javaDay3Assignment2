import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Question1 obj = new Question1();
    System.out.println("Enter marks of 5 subjects out of 100");
    obj.sub1 = sc.nextInt();
    obj.sub2 = sc.nextInt();
    obj.sub3 = sc.nextInt();
    obj.sub4 = sc.nextInt();
    obj.sub5 = sc.nextInt();
    
    obj.display();

    Employee e1 = new Employee();
    e1.display();
  }
}
/*
OUTPUT 
Enter marks of 5 subjects out of 100
96
86 
78
98
88
Percentage: 89.200005 Grade: B
Name: Ankita Age: 21 Annual Salary: 4L Tax Amount: 15%
*/