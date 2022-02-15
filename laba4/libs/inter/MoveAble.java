package libs.inter;

public interface MoveAble {
    default void move(double x, double y){
        if (x>=0){
            System.out.println(x);
        } else {
            System.out.println(-x);
        }

        if (y>=0){
            System.out.println(y);
        } else {
            System.out.println(-y);
        }
    };

    
}