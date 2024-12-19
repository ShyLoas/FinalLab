package Room;

import java.util.*;
import java.text.*;

public class Room implements IRoom {

    String id;
    String name;
    double baseCost;
    Date checkinDate;
    Date checkoutDate;
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    Scanner sc = new Scanner(System.in);

    public Room(String id, String name, double baseCost, Date checkinDate, Date checkoutDate) {
        this.id = id;
        this.name = name;
        this.baseCost = baseCost;
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
    }

    @Override
    public double calculateCost() {
        return baseCost;
    }

    @Override
    public void enterRoomInfo() {
        try {
            System.out.println("Enter ID: ");
            id = sc.next();
            sc.nextLine();
            System.out.println("Enter Name: ");
            name = sc.next();
            System.out.println("Enter base cost: ");
            baseCost = sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter check in date: ");
            checkinDate = df.parse(sc.next());
            System.out.println("Enter Check out date: ");
            checkoutDate = df.parse(sc.next());
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void updateRoomById(String id) {
            try {
                System.out.println("Enter Name: ");
                name = sc.next();
                System.out.println("Enter base cost: ");
                baseCost = sc.nextDouble();
                sc.nextLine();
                System.out.println("Enter check in date: ");
                checkinDate = df.parse(sc.next());
                System.out.println("Enter check out date: ");
                checkoutDate = df.parse(sc.next());
            } catch (ParseException e) {
                System.out.println(e.getMessage());
            }
    }

    @Override
    public void displayDetails() {
        System.out.println("1. ID: " + id);
        System.out.println("2. Name: " + name);
        System.out.println("3. Base Cost: " + baseCost);
        System.out.println("4. Checkin Date: " + df.format(checkinDate));
        System.out.println("5: Checkout Date: " + df.format(checkoutDate));
    }

    public long calculateDayStays() {
        long day = (checkoutDate.getTime() - checkinDate.getTime()) / (1000 * 60 * 60 * 24);
        return day;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public Date getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(Date checkinDate) {
        this.checkinDate = checkinDate;
    }

    public Date getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

}
