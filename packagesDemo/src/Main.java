import matematik.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        System.out.println("Adiniz:");

       String  isim= scanner.nextLine();
        System.out.println("merhaba " + isim);

        DortIslem dortIslem= new DortIslem();
        dortIslem.topla(2,3);
        Logaritma logaritma=new Logaritma();

    }
}
