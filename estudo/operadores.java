package estudo;
// Operadores de Atribuição
public class operadores {
    public static void main(String args[]){
        int meuInt = 10;
        System.out.println("Valor Atual de meuInt: " + meuInt);        
        //Atribuido + 5
        meuInt += 5; // = meuInt = menuInt + 5;
        System.out.println("Valor de meuInt += 5: " + meuInt);
        //Subtraindo + 5
        meuInt -= 5; // = meuInt = menuInt - 5;
        System.out.println("Valor de meuInt -= 5: " + meuInt);
        //Multiplicando * 5
        meuInt *= 5; // = meuInt = menuInt * 5;
        System.out.println("Valor de meuInt *= 5: " + meuInt);
        //Dividindo / 5
        meuInt /= 5; // = meuInt = menuInt / 5;
        System.out.println("Valor de meuInt /= 5: " + meuInt);
        //Resto % 5
        meuInt %= 3; // = meuInt = menuInt % 3; Mudei para 3 para dar um resto se fosse 5 daria 0 porque 10\5 = 2 sem sobras
        System.out.println("Valor de meuInt %= 3: " + meuInt);
    }
    
}