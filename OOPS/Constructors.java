class Student {
    int marks[]=new int[3];

    Student(){
        System.out.println("C0nstructor called.");
    }

    // Copy/Shallow constructor
    // Student(Student s1) { 
    //     marks = new int[3];
    //     this.marks = s1.marks;
    // }

    //Deep copy Constructor
    Student(Student s1) {
        marks = new int[3];
        for(int i=0; i<marks.length;i++){
            this.marks[i] =s1.marks[i];
        }
    }
}

public class Constructors {

    public static void main(String args[]){
        Student s1 = new Student();
        s1.marks[0]=100;
        s1.marks[1]=10;
        s1.marks[2]=80;

        Student s2 = new Student(s1);
        s1.marks[2] = 55; //This updated value will reflect in s2 even it is updates after creating s2 with past values coz s2.marks is just a reference to s1.
        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

