public class Main {
    public static void main(String[] args){
      // BaseLogger[] loggers = new BaseLogger[]{new EmailLogger(), new FileLogger(), new DatabaseLogger(), new ConsoleLogger()};
      // for (BaseLogger logger : loggers) {
      //     logger.Log("log mesaji");
      // }
        CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
        customerManager.add();

    }
}
