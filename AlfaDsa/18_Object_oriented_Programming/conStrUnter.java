public class conStrUnter {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Om prakash";
        s1.roll = 12;
        s1.password = "abce";

        s1.marks[0] = 100;
        s1.marks[1] = 50;
        s1.marks[2] = 90;

        Student s2 = new Student(s1); // s2 copy in s1
        s2.password = "xyz";

        // Print s2 mark
        for (int i = 0; i < 3; i++) {
            s1.marks[1] = 70;
            System.out.println(s2.marks[i]);
            // Pirnt all value of s1,Becouse it is a copy constructer
        }

    }
}

class Student { // create class
    String name; // Property
    int roll;
    String password;
    int marks[];

    // copy constructure
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }

    // Non-Parameter
    Student() {
        marks = new int[3];
        System.out.println("constructure is colling...");
    }

    // Parameter constructure
    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}
