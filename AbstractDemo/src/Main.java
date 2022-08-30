public class Main {
    public static void main(String[] args){
        CustomerManager customerManager=new CustomerManager();
        customerManager.databaseManager =new MySqlDatabaseManager();// new den sonra SqlDatabseManager yazarsak o kotlar calisacaktir..
        customerManager.getCustomers();
    }
}
