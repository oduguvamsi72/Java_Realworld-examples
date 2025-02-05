package javaproject;

public class phones { 
    String brand;
    int price;
    int storage;
    String color;
    int batteryCapacity;

    phones(String brand, int price, int storage, String color, int batteryCapacity) {
        this.brand = brand;
        this.price = price;
        this.storage = storage;
        this.color = color;
        this.batteryCapacity = batteryCapacity;
    }

    void displayMobile() {
        System.out.println("Mobile Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Color: " + color);
        System.out.println("Battery Capacity: " + batteryCapacity + "mAh");
        System.out.println();
    }

    public static void main(String[] args) {
        phones m1 = new phones("Samsung", 60000, 128, "Black", 5000);
        phones m2 = new phones("Apple", 120000, 256, "White", 4000);
        phones m3 = new phones("OnePlus", 50000, 256, "Blue", 4500);
        phones m4 = new phones("Xiaomi", 30000, 128, "Red", 6000);
        phones m5 = new phones("Realme", 25000, 128, "Green", 5000);
        phones m6 = new phones("Google Pixel", 70000, 128, "Gray", 4600);

        m1.displayMobile();
        m2.displayMobile();
        m3.displayMobile();
        m4.displayMobile();
        m5.displayMobile();
        m6.displayMobile();
    }
}
