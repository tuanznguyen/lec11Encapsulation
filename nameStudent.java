
package lec11stacticMethod;

public class nameStudent {
    int rollno;
    String name;
    static String college = "DTU";

    static void change() {
        college = "BBDIT";
    }

    nameStudent(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String args[]) {

        nameStudent.change();  

        nameStudent s1 = new nameStudent(111, "Trang");
        nameStudent s2 = new nameStudent(222, "Duong");

        s1.display();
        s2.display();
    }
}
