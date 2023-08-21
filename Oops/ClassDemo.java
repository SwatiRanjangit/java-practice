package Oops;

class Student{
    private int roll;
    private  String name;

    public void intput(int r, String n ){
        roll = r;
        name =n;
    }

    public void print(){
        System.out.println("name: "+name+" roll: "+roll);

    }

    
}

public class ClassDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.intput(23, "Swati");
        s.print();
    }
}
