package source;
import enums.Places;
import libs.LifeObject;
import libs.inter.PlantAble;


public class Sleepwalkers extends LifeObject implements PlantAble{
    public Sleepwalkers(String str){
        super(str);
    }

    @Override
    public void planted(Places place) {
        System.out.printf("объект %s сажали семена в %s \n", this, place);
    }

}
