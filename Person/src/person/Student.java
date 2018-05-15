
package person;

public class Student extends Person {
    
    private int id;
    
    public Student() {
        super();
        id = 0;
    }
    
    public Student(String name, int number) {
        super(name);
        this.id = number;
    }
    
    public void reset(String newName, int newID) {
        this.setName(newName);
        this.id = newID;
    }
    
    public void writeOutput() {
        System.out.println("Name: " +  this.getName());
        System.out.println("ID: " +  this.id);

    }
    
    public boolean equals(Student otherStudent) {
        return this.hasSameName(otherStudent) && this.id == otherStudent.id;
    }
    
    public static void main(String[] args) {
        Student a = new Student("Aice", -12);
        Student b = new Student("Bob", 12);
        a.writeOutput();
        b.writeOutput();
    }
    
}
