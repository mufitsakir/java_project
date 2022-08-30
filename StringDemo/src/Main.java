public class Main {

    public static void main(String[]args){
        String mesaj = "Bugün Hava Çok Güzel";
        System.out.println(mesaj);
        /*System.out.println("karakter sayisi" + mesaj.length());
        System.out.println("5.eleman : " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" ghaajkak!"));
        System.out.println(mesaj.startsWith("a"));
        System.out.println(mesaj.endsWith("a"));
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("a"));
        System.out.println(mesaj.lastIndexOf("a"));*/


        String yeniMesaj =(mesaj.replace(' ','-'));
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,5));

        for (String kelime :mesaj.split(" ")){
            System.out.println(kelime);

        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());


    }

}
