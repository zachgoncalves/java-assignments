
package oop;

public class Dog {
    
    public static final boolean IS_CANINE = true;
    public String name;
    public int age;
    public String breed; 
    
    public void bark() {
        System.out.println(name + " barks Woof!");
    }
     
    public void dogYears(){
        System.out.println(name + " is " + age*7 + " years old");
    }
    
    public boolean catchObject(String thing) {
        System.out.println(name + " caught the " + thing + "!");
        return true;
    }
    
    public int doubleMyAge(){
        return age*2;
    }
    

}
