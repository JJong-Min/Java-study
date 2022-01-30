public class Ex6_12 {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.color + " " + c.gearType + " " + c.door);
    }
}

class Car {
    String color;
    String gearType;
    int door;

    Car() {
    //        color = "white";
    //        gearType = "auto";
    //        door = 4;
        this("white", "auto", 3);
    }

    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
}
