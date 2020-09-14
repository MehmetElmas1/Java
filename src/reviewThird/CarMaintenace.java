package reviewThird;

public class CarMaintenace {

    private String CarName;
    private int CurrentOdometer;
    private int nextOilChange;
    private String airFilter;
    private String cabinFulter;
    private String oilFilter;

    public CarMaintenace(String carName, int currentOdometer, int nextOilChange, String airFilter, String cabinFulter, String oilFilter) {
        CarName = carName;
        CurrentOdometer = currentOdometer;
        this.nextOilChange = nextOilChange;
        this.airFilter = airFilter;
        this.cabinFulter = cabinFulter;
        this.oilFilter = oilFilter;
    }

    public String getCarName() {
        return CarName;
    }

    public void setCarName(String carName) {
        CarName = carName;
    }

    public int getCurrentOdometer() {
        return CurrentOdometer;
    }

    public void setCurrentOdometer(int currentOdometer) {
        CurrentOdometer = currentOdometer;
    }

    public int getNextOilChange() {
        return nextOilChange;
    }


    public String getAirFilter() {
        return airFilter;
    }

    public void setAirFilter(String airFilter) {
        this.airFilter = airFilter;
    }

    public String getCabinFulter() {
        return cabinFulter;
    }

    public void setCabinFulter(String cabinFulter) {
        this.cabinFulter = cabinFulter;
    }

    public String getOilFilter() {
        return oilFilter;
    }

    public void setOilFilter(String oilFilter) {
        this.oilFilter = oilFilter;
    }

    public void displayFilterStatus() {
        String status = "\t\t\t FILTER STATUS" +
                "AIR FILTER: \t" + this.airFilter + "\n" +
                "Cabin Filter : \t" + this.cabinFulter + "\n" +
                "Oil Filter :\t" + this.oilFilter;
        System.out.println(status);

    }

    public void doOilChange(){

        if(!this.oilFilter.equalsIgnoreCase("new") && this.getNextOilChange()-this.CurrentOdometer<=0){
           this.oilFilter="new";

        }
        else{
            System.out.println("You do not need to change oil filter");
        }

}
    @Override
    public String toString() {
        return "CarMaintenace{" +
                "CarName='" + CarName + '\'' +
                ", CurrentOdometer=" + CurrentOdometer +
                ", nextOilChange=" + nextOilChange +
                ", airFilter='" + airFilter + '\'' +
                ", cabinFulter='" + cabinFulter + '\'' +
                ", oilFilter='" + oilFilter + '\'' +
                '}';
    }
}
