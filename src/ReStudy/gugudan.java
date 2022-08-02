package ReStudy;

public class gugudan {
    public static void gugudan(int level, int count){
        if(count>9){
            return;
        }
        System.out.printf("%d x %d = %d\n", level, count, level * count);
        gugudan(level, ++count);
    }
}