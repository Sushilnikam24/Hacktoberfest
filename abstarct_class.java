abstract class Person {
    String name;

    Person(){
        this.name="Anil";
        System.out.println("In abstract method,Nmae:"+this.name);
    }
    Person(String name){
        this.name=name;
    }
    void shname(){
        System.out.println("In abstract method");
        System.out.println("Name:"+this.name);
    }
}

class Employee extends Person{
    int eid;
    String cname;

    Employee(){
        super();
        this.eid=111;
        this.cname="IBM";
    }
    Employee(String name,int i,String cn){
        super(name);
        this.name="Sushil";
        this.eid=24;
        this.cname=cn;
    }

    void shname(){
        System.out.println("Employee id:"+this.eid);
        System.out.println("Employee company:"+this.cname);
    }
    void show(){
        System.out.println("Abtstract mathod defination");
    }
}

public class AbstractC{
    public static void main(String[] args){
        Person p1=new Employee();
        p1.shname();
        Employee p =new Employee("Ravi",112,"MIT");
        p.shname();
        p.show();
    }
}

