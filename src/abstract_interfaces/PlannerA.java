package abstract_interfaces;

import java.util.Arrays;

public class PlannerA {

 /*  private String plannerName;
  private  int index=0;
   private String[][] events;
   private int numberOfEvents;
   public PlannerA(String plannerName, int numberOfEvents){
       this.plannerName = plannerName;
       String [][] temp = new String [2][numberOfEvents];
       this.events = temp;
   }

    public String getPlannerName() {
        return plannerName;
    }

    public void setPlannerName(String plannerName) {
        this.plannerName = plannerName;
    }

    public String[][] getEvents() {
        return events;
    }

    public void setEvents(String[][] events) {
        this.events = events;
    }

    public int getNumberOfEvents() {
        return numberOfEvents;
    }

    public void setNumberOfEvents(int numberOfEvents) {
        this.numberOfEvents = numberOfEvents;
    }

 public void addEvents(String date, String event){
if(this.index<this.numberOfEvents){
this.events[0][index] = date;
this.events[1][index] = event;
this.index++;

 }
else{
    System.out.println("Planner is Full");
}
 }
public void displayPlanner(){
       for(String row[] : this.events){
           System.out.print("Date :\t");
           for(String str : row){
               System.out.println(str+"\t");
           }
       }
}
    @Override
    public String toString() {
        return "Planner{" +
                "plannerName='" + plannerName + '\'' +
                ", events=" + Arrays.toString(events) +
                ", numberOfEvents=" + numberOfEvents +
                '}';
    }
}

class PlannerTest{
    public static void main(String[] args) {
        PlannerA planner = new PlannerA("first","5");
        System.out.println(planner.toString());

        planner.addEvents("Aug 15th", "Study Java" );
       planner.displayPlanner();
    }*/
}
