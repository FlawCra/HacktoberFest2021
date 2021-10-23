public class ArrayObj
{
        public static void main(String[] args)
    {
        teacher obj[]= new teacher[2];
        Student obj1[]= new Student[2];
        obj[0]= new teacher(101,32);
        obj[1]= new teacher(103,23);
        obj1[0]= new Student(1,25);
        obj1[1]= new Student(2,15);
        System.out.println("Teacher Obj 1:");
        obj[0].display();
        System.out.println("Teacher Obj 2:");
        obj[1].display();
        System.out.println("Student Obj 1:");
        obj1[0].display();
        System.out.println("Student Obj 2:");
        obj1[1].display();
    }
}

class teacher
{
    int teacherId;
    int teacher_age;
    public teacher(int id,int age)
    {
        teacherId=id;
        teacher_age=age;
    }
    public void display()
    {
        System.out.println("Teacher id : "+teacherId);
        System.out.println("Teacher age : "+teacher_age);
    }
}

class Student
{
    int student_id,student_age;
    public Student(int id,int age)
    {
        student_id=id;
        student_age=age;
    }
    public void display()
    {
        System.out.println("Student id : "+student_id);
        System.out.println("Student age : "+student_age);
    }
}
