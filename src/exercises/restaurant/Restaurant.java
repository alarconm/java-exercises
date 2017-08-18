package exercises.restaurant;

import java.util.ArrayList;

public class Restaurant {

    public static void main(String[] args){

        MenuItem burger = new MenuItem("burger", 14.99, "tasty burger", "entree");
        MenuItem chickenburger = new MenuItem("cburger", 14.99, "tasty cburger", "entree");
        ArrayList<MenuItem> foodList = new ArrayList<MenuItem>();
        foodList.add(burger);
        foodList.add(chickenburger);
        Menu aMenu = new Menu(false, foodList);
        MenuItem salad = new MenuItem("salad", 10.00, "gross salad", "entree");


        System.out.println("last time it was updated" + aMenu.getLastUpdated());
        aMenu.addMenuItems(salad);
        System.out.println("is menu new?" + aMenu.getIsNew());
        System.out.println("list of items" + aMenu.getMenuItems());
        aMenu.removeMenuItem(burger);
        System.out.println("should have list minus the burger" + aMenu.getMenuItems());
        System.out.println("does burger equal salad" + burger.equals(salad));
        System.out.println("is menu new?" + aMenu.getIsNew());



    }
}
