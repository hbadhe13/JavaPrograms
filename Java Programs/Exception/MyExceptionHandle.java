package Exception;

public class MyExceptionHandle {
    public static void main(String args[]){
        try{
            for(int i=0;i<10;i++){
                System.out.println(10/i);
            }
        } catch(Exception ex){
            System.out.println("Exception Message: "+ex.getMessage());
            ex.printStackTrace();
        }
        System.out.println("After for loop...");
    }
}