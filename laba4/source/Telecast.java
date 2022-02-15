package source;
import libs.SceneObject;
import libs.inter.PowerAble;

public class Telecast extends SceneObject implements PowerAble{

    private boolean power=false;

    public Telecast(String str) {
        super(str);
    }

    public void power(){
        if (power == false){
            System.out.println("Передача включена");
            this.power = true;
        }
        else{
            System.out.println("Передача выключена");
            this.power = false;
        }
    }
}
