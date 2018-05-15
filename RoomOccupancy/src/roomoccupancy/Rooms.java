
package roomoccupancy;

public class Rooms {
    
    public static void main(String[] args) {
        
        //new room
        RoomOccupancy kitchen = new RoomOccupancy();
        kitchen.addOneToRoom();
        kitchen.addOneToRoom();
        kitchen.addOneToRoom();
        System.out.println("Total Number in this room: " + kitchen.getNumber());
        
        // new room
        RoomOccupancy bathroom = new RoomOccupancy();
        bathroom.addOneToRoom();
        bathroom.removeOneFromRoom();
        System.out.println("Total Number in this room: " + bathroom.getNumber());
        
        // new room
        RoomOccupancy livingRoom = new RoomOccupancy();
        livingRoom.addOneToRoom();
        livingRoom.addOneToRoom();
        livingRoom.addOneToRoom();
        livingRoom.addOneToRoom();
        livingRoom.addOneToRoom();
        livingRoom.removeOneFromRoom();
        System.out.println("Total Number in this room: " + livingRoom.getNumber());
        
        // output total in building 
        System.out.println("Total Number in the building: " + RoomOccupancy.getTotalNumber());
        
    }
    
}
