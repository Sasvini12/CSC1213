class Main1 {
    String brand;
    int year;

    Main1(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
	
    int getAge(int currentYear) {
        return currentYear - year;
    }
}

public class Car {
    public static void main(String[] args) {
        Main1 car1 = new Main1("Toyota", 2020);
        Main1 car2 = new Main1("Dodge", 2016);

        car1.displayInfo();
        car2.displayInfo();

        int currentYear = 2025; 
        Main1 myCar = new Main1("Toyota", 2020);
        int age = myCar.getAge(currentYear);
        System.out.println("My " + myCar.brand + " is " + age + " years old.");
    }
}
		
		
	
	