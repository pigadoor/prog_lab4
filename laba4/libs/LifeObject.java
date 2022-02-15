package libs;
import libs.inter.MoveAble;
import libs.inter.SpeakAble;
import libs.inter.SuplieAble;
import libs.inter.ThinkAble;

public abstract class LifeObject extends SceneObject implements SpeakAble, ThinkAble, MoveAble, SuplieAble{
    public LifeObject(String str) {
        super(str);
    }
    
    @Override
    public void speak(String phrase){
        System.out.printf("объект %s говорит - %s \n",toString(), phrase);
    }

    @Override
    public void think(){
        System.out.printf("%s думает \n",toString());
    }

    @Override
    public void suplie(SceneObject obj, String name){
        System.out.printf("%s снабажет %s %s",toString(), obj, name);
    }
}