
package roomoccupancy;

public class RoomOccupancy {
    
    private int numberInRoom;
    private static int totalNumber;

    public static int getTotalNumber() {
        return totalNumber;
    }

    public static void setTotalNumber(int totalNumber) {
        RoomOccupancy.totalNumber = 0;
    }
    
    public void addOneToRoom() {
        numberInRoom++;
        totalNumber++;
    }
    
    public void removeOneFromRoom() {
        numberInRoom--;
        totalNumber--;
        
        // default negative numbers to 0
        if(numberInRoom < 0) {
            numberInRoom = 0;
        }
    }
    public int getNumber() {
        return numberInRoom;
    }
}
