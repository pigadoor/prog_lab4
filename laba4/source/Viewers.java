package source;
import libs.LifeObject;
import libs.SceneObject;
import libs.inter.CheckAble;
import libs.inter.WatchAble;



public class Viewers extends LifeObject implements WatchAble{
    
    private final String znaikaName = "Знайка";
    private final String neznaikaName = "Незнайка";

    CheckAble checker = new CheckAble()
    {
        public void checkFinalNames() throws IllegalFinalNameException
        {
            if (!znaikaName.equals("Знайка") | !neznaikaName.equals("Незнайка")) throw new IllegalFinalNameException();
        }
    };
    
    public Viewers(String str) {
        super(str);
    }

    @Override
    public void watch(SceneObject obj, String policeName) {
        try {
            this.checker.checkFinalNames();
        }
        catch(IllegalFinalNameException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        System.out.printf("объект %s %s смотрит объект %s \n",toString(), policeName, obj);
    }
}
