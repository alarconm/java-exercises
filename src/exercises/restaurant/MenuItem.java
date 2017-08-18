package exercises.restaurant;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

public class MenuItem {

    private String itemName;
    private Double price;
    private String description;
    private String category;
    private static Date creationDate;


    public MenuItem(String itemName, Double price, String description, String category) {

        this(itemName, price, description, category, Timestamp.valueOf(LocalDateTime.now()));
    }


    public MenuItem(String itemName, Double price, String description, String category, Date creationDate) {
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.category = category;
        this.creationDate = creationDate;
    }


    public static Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public String getItemName() {
        return itemName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        MenuItem theItem = (MenuItem) obj;
        return theItem.getItemName() == getItemName();

    }


}