
package darkroom;

public class MasterHouse {
    private String houseName; 
    private String sigil;
    private String words;
    
    public String getHouseName() {
        return this.houseName;
    }
    public String setHouseName(String greatHouseName) {
        return this.houseName = greatHouseName;
    }
    
    public MasterHouse() {
        houseName = "There are no master houses currently.";
    }
    
    
}
