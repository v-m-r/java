public class SysDemo {
   public static void main(String arg[]){
    String s = System.getProperty("java.version.date");
    System.out.println(s);
    s = System.getProperty("os.arch");
    System.out.println(s);
    s = System.getProperty("os.version");
    System.out.println(s);
    s = System.getProperty("os.name");
    System.out.println(s);
    s = System.getProperty("java.vm.name");
    System.out.println(s);
    s = System.getProperty("java.vm.specification.vendor");
    System.out.println(s);
    s = System.getProperty("java.vendor.url");
    System.out.println(s);
    s = System.getProperty("user.dir");
    System.out.println(s);
    s = System.getProperty("user.name");
    System.out.println(s);
    s = System.getProperty("user.home");
    System.out.println(s);
   } 
}
