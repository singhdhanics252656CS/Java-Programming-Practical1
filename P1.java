class Student {
    String name;
    int age;

    // Constructor Overloading
    Student() {
        this.name = "Unknown";
        this.age = 0;
    }

    Student(String name) {
        this.name = name;
        this.age = 0;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method Overloading
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    void display(String prefix) {
        System.out.println(prefix + " Name: " + name + ", Age: " + age);
    }

    // Static Method
    static void welcomeMessage() {
        System.out.println("Welcome to the Student Management System!");
    }

    public static void main(String[] args) {
        // Calling static method
        Student.welcomeMessage();

        // Using constructor overloading
        Student s1 = new Student();
        Student s2 = new Student("Alice");
        Student s3 = new Student("Bob", 22);

        // Using method overloading
        s1.display();
        s2.display("Student Info:");
        s3.display();
    }
}
