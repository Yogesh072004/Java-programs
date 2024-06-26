//With a example show how the constructor of abstract class is called.
abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Declaration of concrete method.
    void m1() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
    }
}

class Engineer extends Employee {
    public Engineer(String name, int id) {
        super(name, id); // This statement is used to call super class constructor.
    }

    public static void main(String[] args) {
        // Creating an object of the subclass of abstract class.
        Engineer e = new Engineer("Deep Java", 20000);
        e.m1();
    }
}