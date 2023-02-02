package InheritanceProject;

public class Student {
    int roll,mark;






    String name;
    void input()
    {
        System.out.println("enter roll name & marks");
    }
}
class ankit extends Student
{
    void disp()
    {
        roll=1; name="ankit"; mark=100;
        System.out.println(roll+" "+name+" "+mark);
    }

    public static void main(String[] args) {
        ankit r=new ankit();
        r.input(); r.disp();
    }
}

