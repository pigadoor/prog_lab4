package enums;
import java.util.Arrays;

public enum Places {
    NEELOVKA("деревне Нееловке"),
    GOLOPYATKINO("селе Голопяткине"),
    BESHLEBOVO("селе Бесхлебове"),
    GOLODAEVKA("селе Голодаевке"),
    NEPROLAZNOE("селе Непролазном");

    private String personValue;
    private Places(String str){
        personValue = str;
    }
    public String toString(){
        return personValue;
    }

    public static void listOfPlaces(){
        System.out.println(Arrays.toString(Places.values()));
    }
}