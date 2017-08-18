package exercises.restaurant;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private Date lastUpdated;
    private boolean isNew = false;
    private ArrayList<MenuItem> menuItems;

    public Menu(boolean isNew, ArrayList menuItems) {
        this(isNew, menuItems, Timestamp.valueOf(LocalDateTime.now()));
    }

    public Menu(boolean isNew, ArrayList menuItems, Date lastUpdated) {

        this.lastUpdated = lastUpdated;
        this.isNew = getIsNew();
        this.menuItems = menuItems;

    }

    public ArrayList getMenuItems() {
        ArrayList<String> stringMenu = new ArrayList<>();

        for( MenuItem item : menuItems) {
            stringMenu.add(item.getItemName());

        }
        return stringMenu;
    }

    public void addMenuItems(MenuItem aItem) {
        this.menuItems.add(aItem);
    }

    public void printMenuItem(MenuItem aitem) {
        System.out.println(aitem);
        this.lastUpdated = Timestamp.valueOf(LocalDateTime.now());
    }

    public void removeMenuItem(MenuItem aItem) {
        this.menuItems.remove(aItem);
    }

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
