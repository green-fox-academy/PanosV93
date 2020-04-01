package theGardenApplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    protected List<Plant> plants;

    public Garden(){
        this.plants = new ArrayList<>();
    }
    public void addPlants(Plant createdPlant){
        this.plants.add(createdPlant);

    }
}
