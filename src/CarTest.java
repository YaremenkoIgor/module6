import java.util.Scanner;


public class CarTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Укажите наличие водителя (yes/no)");
        String driver = sc.nextLine();
        System.out.println("Укажите пристегнут ли ремень безопасности(yes/no)");
        String belt = sc.nextLine();
        System.out.println("Укжате тип горючего(benzine/other)");
        String fuel = sc.nextLine();
        System.out.println("Укажите количество бензина в баке");
        String fuilL = sc.nextLine();
        int fuelL = Integer.parseInt(fuilL);

        Car car = new Car(driver, belt, fuel, fuelL);

        car.checkDriver(driver);
        car.checkBelt(belt);
        car.checkTypeOfFuel(fuel);
        car.checkFuel(fuelL);


    }


}
