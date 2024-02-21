public class ProcessBuildDemo {
    public static void main(String[] args) {
        try{
        ProcessBuilder p = new ProcessBuilder("Add.py","Python Add.py");
        p.start();
        }
        catch(Exception e){
            System.out.println("Interupted exection");
        }
    }
}
