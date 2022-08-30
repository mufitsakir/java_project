public class MySqlCustomerDal extends OracleCustomerDal implements ICustomerDal,IRepositoory{

    @Override
    public void add(){
        System.out.println("MySql eklendi");
    }
}
