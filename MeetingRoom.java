
package Room;

import java.util.Date;

public class MeetingRoom extends Room {
    int capacity;

    public MeetingRoom(int capacity, String id, String name, double baseCost, Date checkinDate, Date checkoutDate) {
        super(id, name, baseCost, checkinDate, checkoutDate);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    @Override
    public double calculateCost(){
        if(capacity > 50){
            return (getBaseCost() * calculateDayStays()) * 1.2;
        }else{
            return getBaseCost() * calculateDayStays();
        }
    }
    
    @Override
    public void enterRoomInfo(){
        super.enterRoomInfo();
        System.out.println("Enter capacity: ");
        capacity = sc.nextInt();
    }
    
    @Override
    public void updateRoomById(String id){
        super.updateRoomById(id);
        System.out.println("Enter capacity");
        capacity = sc.nextInt();
    }
    
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("6. Capacity: " + capacity);
    }
}
