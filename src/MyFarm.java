import java.util.ArrayList;

public class MyFarm {
    //declaration section
    ArrayList<Plot> row;

    public static void main(String[] args) {
        MyFarm HarrisonFawcett = new MyFarm();
    }

    public MyFarm() {
        row = new ArrayList<>();

        for (int i = 0; i < 10; i++)
            row.add(new Plot());

        for (int x = 0; x < row.size(); x++) {
            row.get(x).printPlotInfo();

        }
        totalPlants();
        printPlantNames();
        printRowInfo();
        addLettuce();
        tomatoLocations();
        totalCarrots();
        averageNumberOfPlants();

    }//MyFarm is the constructor method

    public void totalPlants() {
        System.out.println("Total Plants");
        int total = 0;
        for (int t = 0; t < row.size(); t++) {
            total = total + row.get(t).numberOfPlants;
        }
        System.out.println("totalPlants " + total);
    }

    public void printPlantNames() {
        System.out.println("*******");
        for (int t = 0; t < row.size(); t++) {
            System.out.print(t + ": " + row.get(t).plantName);
        }
    }

    public void printRowInfo() {
        System.out.println("*******PRINT ROW INFO");
        for (int x = 0; x < row.size(); x++) {
            row.get(x).printPlotInfo();
        }
    }

    public void addLettuce() {
        System.out.println("*******ADD LETTUCE");
        printPlantNames();
        row.add(new Plot());
        row.get(10).plantName = "lettuce";
        row.get(10).numberOfPlants = 42;
        row.get(10).needsWater = true;


        printPlantNames();

    }

    public void tomatoLocations() {
        System.out.println("********TOMATO LOCATIONS******");
        printPlantNames();
        System.out.print("There are tomatoes in the following plots:");
        for (int i = 0; i < row.size(); i++) {
            if (row.get(i).plantName.equals("tomato")) ;
            System.out.print(i + ",");
        }
    }

    public void totalCarrots() {
        System.out.println("********TOTAL CARROTS******");

        int total = 0;
        for (int i = 0; i < row.size(); i++) {
            if (row.get(i).plantName == "carrot") {
                total = total + row.get(i).numberOfPlants;
            }
        }
        System.out.println("The total number of carrots is " + total);
    }
    public void averageNumberOfPlants(){
        System.out.println("********AVG PLANTS******");

        int total=0;
        int avg=0;
        for(int k=0; k<row.size(); k++){
            total=total+row.get(k).numberOfPlants;

        }
        avg=total/row.size();
        System.out.println("Average Number of plants: "+avg);


    }

}