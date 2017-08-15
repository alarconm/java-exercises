package exercises.restaurant;

import sun.misc.resources.Messages_it;
import sun.util.calendar.BaseCalendar;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Menu {

    public static void main(String[] args){

        MenuItem burger = new MenuItem("burger", 14.99, "tasty burger", "entree");
        MenuItem chickenburger = new MenuItem("cburger", 14.99, "tasty cburger", "entree");
        ArrayList<MenuItem> foodList = new ArrayList<MenuItem>();
        foodList.add(burger);
        foodList.add(chickenburger);
        Menu aMenu = new Menu(false, foodList);


        System.out.println(burger.getCategory());

    }

    private Date lastUpdated;
    private boolean isNew = false;
    private ArrayList menuItems;

    public Menu(boolean isNew, ArrayList menuItems) {
        this(isNew, menuItems, Timestamp.valueOf(LocalDateTime.now()));
    }

    public Menu(boolean isNew, ArrayList menuItems, Date lastUpdated) {

        this.lastUpdated = lastUpdated;
        this.isNew = getIsNew();
        this.menuItems = menuItems;

    }

    public ArrayList getMenuItems() {
        return menuItems; }

    public void setMenuItems(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public boolean getIsNew() {
        if (!MenuItem.getCreationDate().equals(lastUpdated)) {
            return true;
        }
        return false;
    }
}
