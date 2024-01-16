class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter pentru nume
    public String getName() {
        return name;
    }

    // Setter pentru nume
    public void setName(String name) {
        this.name = name;
    }

    // Getter pentru varsta
    public int getAge() {
        return age;
    }

    // Setter pentru varsta
    public void setAge(int age) {
        this.age = age;
    }
}

class Student extends Person {
    private int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age); // Apelam constructorul clasei parinte
        this.studentId = studentId;
    }

    // Getter pentru ID-ul studentului
    public int getStudentId() {
        return studentId;
    }

    // Setter pentru ID-ul studentului
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age); // Apelam constructorul clasei parinte
        this.subject = subject;
    }

    // Getter pentru materie
    public String getSubject() {
        return subject;
    }

    // Setter pentru materie
    public void setSubject(String subject) {
        this.subject = subject;
    }
}

public class Clasa {
    public static void main(String[] args) {
        // Exemplu de utilizare
        Student student = new Student("John Doe", 20, 12345);
        Teacher teacher = new Teacher("Mrs. Smith", 35, "Mathematics");

        System.out.println("Student: " + student.getName() + ", Age: " + student.getAge() + ", Student ID: " + student.getStudentId());
        System.out.println("Teacher: " + teacher.getName() + ", Age: " + teacher.getAge() + ", Subject: " + teacher.getSubject());
    }
}
