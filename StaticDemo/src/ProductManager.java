public class ProductManager {
    public void add(Product product){
        if (ProductValidator.isValied(product)){
            System.out.println("eklendi");
        }
        else {
            System.out.println("urun bilgileri gecersizdir.");
        }

    }
}
