class Student{
    String name;
    static String teacher;
}

public class Static_Demo {
    public static void main(String[] args) {
        Student ram = new Student();
        Student tom = new Student();
        ram.name = "Ram";
        tom.name = "Tom";
        System.out.println(ram.name);
        System.out.println(tom.name);
        Student.teacher = "Vinod";
        // tom.teacher = "Subodh";
        System.out.println(ram.teacher);
        System.out.println(tom.teacher);
    }
    void printTable(int n, int i){

    }
}
