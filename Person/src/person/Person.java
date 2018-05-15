
package person;

public class Person {

    private String name; 
    
    public Person() {
        name = "The person with no name.";
    }
    
    public Person(String name) {
        this.name = name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void writeOutput() {
        System.out.println("Name: " + name);
    }
    
    public boolean hasSameName(Person otherPerson) {
        return this.name.equalsIgnoreCase(otherPerson.name);
    }
    
}
