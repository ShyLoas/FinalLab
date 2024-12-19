package Room;

import java.util.*;


public class RoomList {
    ArrayList<Room> roomList = new ArrayList<>();
    
    public void addRoom(Room room){
        roomList.add(room);
    }

    public ArrayList<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(ArrayList<Room> roomList) {
        this.roomList = roomList;
    }
    
    public void updateRoomById(String Id){
        boolean found = false;
        for(Room r : roomList){
            if(r.getId().equals(Id)){
                r.updateRoomById(Id);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Room ID not found");
        }
    }
    
    public void deleteRoomById(String Id){
        Iterator<Room> iterator = roomList.iterator();
    while (iterator.hasNext()) {
        Room r = iterator.next();
        if (r.getId().equals(Id)) {
            iterator.remove();
            break;
        }
    }
    }
    
    public void findRoomById(String Id){
        boolean found = false;
        for(Room r : roomList){
            if(r.getId().equals(Id)){
                r.displayDetails();
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Room ID not found");
        }
    }
    
    public void displayAllRoom(){
        for(Room r : roomList){
            r.displayDetails();
        }
    }
    
    public Room findMostExpensiveRoom(){
        Room ex = null;
        double max = 0;
        for(Room r : roomList){
            double base = r.calculateCost();
            if(base > max){
                ex = r;
                max = base;
            }
        }
        return ex;
    }
    
    public void countRoom(){
        int mCount = 0;
        int bCount = 0;
        
        for(Room r : roomList){
            if(r instanceof MeetingRoom){
                mCount++;
            }else if(r instanceof BedRoom){
                bCount++;
            }
        }
        System.out.println("Meeting Room: " + mCount++);
        System.out.println("Bed Room: " + bCount++);
    }
}
