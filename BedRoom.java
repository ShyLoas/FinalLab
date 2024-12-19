
package Room;

import java.util.Date;

public class BedRoom extends Room {
    int numberOfBeds;

    public BedRoom(int numberOfBeds, String id, String name, double baseCost, Date checkinDate, Date checkoutDate) {
        super(id, name, baseCost, checkinDate, checkoutDate);
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }
    
    @Override
    public double calculateCost(){
        if(numberOfBeds >= 3){
            return (getBaseCost() * calculateDayStays()) * 1.1;
        }else{
            return getBaseCost() * calculateDayStays();
        }
    }
    
    @Override
    public void enterRoomInfo(){
        super.enterRoomInfo();
        System.out.println("Enter number of Beds: ");
        numberOfBeds = sc.nextInt();
    }
    
    @Override
    public void updateRoomById(String id){
        super.updateRoomById(id);
        System.out.println("Enter number of Beds");
        numberOfBeds = sc.nextInt();
    }
    
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("6. Number of Beds: " + numberOfBeds);
    }
}
