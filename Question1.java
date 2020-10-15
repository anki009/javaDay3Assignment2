
public class Question1{
  int sub1, sub2, sub3, sub4, sub5;
  float percentage, total;
  char grade;

  
  public void display() {
  total = sub1+sub2+sub3+sub4+sub5;
  percentage = (total/500)*100;

  if(percentage>=90){
    grade='A';
  }
  else if(percentage>=80){
    grade='B';
  }
  else if(percentage>=70){
    grade='C';
  }
  else if(percentage>=50){
    grade='D';
  }
  else if(percentage>=40){
    grade='E';
  }
  else{
    System.out.println("Fail");
  }
  
  System.out.println("Percentage: "+ percentage + " Grade: " + grade);

  }
}
   
    