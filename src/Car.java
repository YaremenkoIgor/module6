public class Car {

    String driver = "yes";
    String belt = "yes";
    String typeFuel = "benzine";
    int fuel = 0;

    public Car(String driver, String belt, String typeFuel, int fuel) {
        this.driver = driver;
        this.belt = belt;
        this.typeFuel = typeFuel;
        this.fuel = fuel;

    }


    public String checkDriver(String driver) {

        try {
            if (getDriver().equals("yes")) {
                System.out.println("driver ok");

            } else {
                throw new CarException("CarException: Водителя нет в машине " + driver);
            }
        } catch (CarException ex) {

            System.err.println(ex.getValue());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return driver;
    }

    public String checkBelt(String belt) {
        try {

            if (getBelt().equals("yes")) {
                System.out.println("belt ok");
            } else {
                throw new CarException("CarException: Ремень не пристегнут " + belt);
            }
        } catch (CarException ex) {
            System.err.println(ex.getValue());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return belt;
    }

    public String checkTypeOfFuel(String typeFuel) {
        try {


            if (getTypeFuel().equals("benzine")) {
                System.out.println("Type of fuel is the benzine");

            } else {
                throw new Exception("CarException: Неверный тип горючего" + typeFuel);
            }
        } catch (CarException ex) {
            System.err.println(ex.getValue());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return typeFuel;
    }

    public int checkFuel(int fuel) {

        try {

            if (getFuel() > 0) {
                System.out.println("gas ok");
            } else {
                throw new Exception("CarException: В баке нетгорючего" + fuel);
            }
        } catch (CarException ex) {
            System.err.println(ex.getValue());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return fuel;
    }


    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getBelt() {
        return belt;
    }

    public void setBelt(String belt) {
        this.belt = belt;
    }

    public String getTypeFuel() {
        return typeFuel;
    }

    public void setTypeFuel(String typeFuel) {
        this.typeFuel = typeFuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}

