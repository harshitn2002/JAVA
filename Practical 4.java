import java.util.*;

class Employ{
    int ID;
    String name;
    String Department;
    int salary;
    Employ(){
        ID = 0;
        name = null;
        Department = null;
        salary = 0;
        System.out.println("A new Employ has been created");
    }
    void setDetails(int ID , String name , String Department , int salary){
        this.ID = ID;
        this.name = name;
        this.Department = Department;
        this.salary = salary;
    } 
    void showDetails()
    {
        System.out.println("Employ Id is: "+ ID);
        System.out.println("Employ name is: "+ name);
        System.out.println("Employ Department is: "+ Department);
        System.out.println("Employ salary is: "+ salary);
    }
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of Employ : ");
        String name = sc.next();
        System.out.println("Enter the Id : ");
        int ID = sc.nextInt();
        System.out.println("Enter the Department: ");
        String Department = sc.next();
        System.out.println("Enter the salary : ");
        int salary = sc.nextInt();
        Employ e = new Employ();
        e.setDetails(ID,name,Department,salary);
        e.showDetails();
    }
}
