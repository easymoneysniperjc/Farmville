public class Plot {

    public String plantName;
    public int numberOfPlants;
    public boolean needsWater;

    public Plot(){
        //use randomization to assign variables
        numberOfPlants= (int)(Math.random()*90*10);

        int plantIO=(int)(Math.random()*5);

        if(plantIO==0){
            plantName= "empty";
            numberOfPlants=0;

        } else if(plantIO==1){
            plantName= "tomato";
        } else if (plantIO==2){
            plantName= "carrot";
        } else if (plantIO==3){
            plantName= "tulip";
        } else{
            plantName= "lettuce";
        }
        int waterIO= (int)(Math.random()*2);

        if(waterIO==0 && !plantName.equals("empty")){
            needsWater=true;
        }else{
            needsWater=false;
        }
        

    }
    public void printPlotInfo(){
        System.out.println("plant Name "+ plantName);
        System.out.println("number Of Plants "+ numberOfPlants);
        System.out.println("needs Water "+ needsWater);
    }
}
