package OOPS;
public class copyConstructor{
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.name = "Dipak";
        std1.roolNo = 101;
        std1.password = "abcdedf";
        std1.marks[0]=10;
        std1.marks[1]=20;
        std1.marks[2]=30;

        //copy construtor
        Student std2 = new Student(std1);
        std2.password="1234";
        std2.marks[0]=40;


        for(int i=0;i<std1.marks.length;i++){
            System.out.println(std2.marks[i]);
        }
    }
}
class Student{
    String name;
    int roolNo;
    String password;
    int marks[];    
    Student(){
        marks = new int[3];
        System.out.println("Constructor is called.......");
    }
    Student(String name){
        this.name=name;
    }
    Student(int roolNo){
        this.roolNo=roolNo;
    }
    Student(Student std1){
        this.name = std1.name;
        this.roolNo = std1.roolNo;
    }
}