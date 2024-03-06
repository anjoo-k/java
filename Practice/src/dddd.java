
class MobilePhone {
   protected String number;
   
   public MobilePhone(String num) {
      number = num; 
   }
   public void answer() {
      System.out.println("Hi~ from " + number);
   }
}






class SmartPhone extends MobilePhone {
   private String androidVer;
   
   public SmartPhone(String num, String ver) {
      super(num);
      androidVer = ver;
   }
   public void playApp() {
      System.out.println("App is running in " + androidVer);
   }
}

