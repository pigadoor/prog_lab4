package libs;

public abstract class SceneObject {
    private String name;
    
    public SceneObject(String str) {
        this.name = str;
        System.out.printf("объект %s создан \n", toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == null || this.getClass()!= obj.getClass()) return false;
        SceneObject another = (SceneObject)obj;
        return this.toString() == another.toString();
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return this.name;
    }
}
