package OOPS;

public class StaticKey_word {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.college = "Bsc.Hons";
        System.out.println(s1.percentage(90, 80, 70)+ "%");	
        Student s2 = new Student();
        System.out.println(s2.college);
        Student s3 = new Student();
        s3.college = "cyber security";
        //all the student object s1, s2, s3 are sharing the college name and pointing to the same stack memory location stack
    }
}

class Student {
    //this percentage method is static so it will same all the student object
    static int percentage(int math,int science,int english) {
        return (math + science + english) / 3;
    }
    String name;
    int rollno;
    static String college;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
