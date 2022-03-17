package estudo;

public class tabuadaCompleta {
    public static void main (String[] args) {
        
        for(int tabuada=1; tabuada<=10; tabuada++) {
        System.out.println(tabuada);
        
            for(int contador=1; contador<=10; contador++) {
            System.out.println(contador+"x"+tabuada+"="+(contador*tabuada));
            }
        }
    }
}