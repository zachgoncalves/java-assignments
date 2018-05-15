
package person;

public class Undergraduate extends Student {
    
    private int level; 
    
    public Undergraduate() {
        super();
        level = 1; 
    }
    
    public Undergraduate(String name, int id, int level) {
        super(name, id);
        this.level = level;
    }
    
    public void reset(String name, int id, int level) {
        super.reset(name, id);
        this.level = level;
    }
    
    public void writeOutput() {
        super.writeOutput();
        System.out.println("Level: " + level);
    }
    
    public boolean equals(Undergraduate u) {
        return super.equals(u) && this.level == u.level;
    }
    
    public static void main(String[] args) {
        Undergraduate d = new Undergraduate("Don", 12345, 2);
        Undergraduate d2 = new Undergraduate("Don", 12345, 2);
        System.out.println(d.equals(d2));
        
        d.writeOutput();
    }

}
