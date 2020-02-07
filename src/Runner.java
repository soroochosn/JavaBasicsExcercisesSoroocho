public class Runner {
    public static void main(String[] args){
        Car mycar = new Car(2025, "Benz", 5000, "G wagon");
        System.out.println(mycar.toString());
        mycar.drive(100);
        System.out.println(mycar.toString());
        Rectangle myRectangle = new Rectangle(10,20);
        System.out.println(myRectangle.toString());

        }
    }

