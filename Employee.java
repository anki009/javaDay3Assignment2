public class Employee{

  String name = "Ankita";
  int dateOfBirth=10;
  int monthOfBirth = 07;
  int birthYear = 1999;
  int age = 2020 - birthYear;
  int taxAmount; 
  


  int monthlySalary = 40000;
  int annual_salary =  monthlySalary*12;
 
  public void display(){
    if(annual_salary >= 500000 ){
      taxAmount= 20;
      annual_salary = 5;
    }
    else if(annual_salary >= 400000 ){
      taxAmount= 15;
      annual_salary = 4;
    }
    else if(annual_salary >= 300000 ){
      taxAmount= 10;
      annual_salary = 3;
    }
    else if(annual_salary >= 200000 ){
      taxAmount= 5;
      annual_salary = 2;
    }

    System.out.println("Name: "+ name +" Age: "+ age+ " Annual Salary: "+ annual_salary+"L"+ " Tax Amount: "+ taxAmount+"%" );

  }


}