public class Main {

    public static void main(String[] args){
        String mesaj = "bugun hava cok guzel.";
        String yeniMesaj = sehirver();
        System.out.println(yeniMesaj);
        int sayi = topla(5,7);
        System.out.println(sayi);
        int toplam = topla2(2,3,5,214,1);
        System.out.println(toplam);

    }

    public static void ekle(){

        System.out.println("add");
    }

    public static void sil(){
        System.out.println("deleted");
    }

    public static void guncelle(){
        System.out.println("update");
    }

    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    public static int topla2(int... sayilar){
        int toplam = 0;
        for (int sayi : sayilar){
            toplam+=sayi;
        }
        return toplam;
    }

    public static String sehirver(){
        return "istanbul";
    }

}
