public class Calculation {
public static int var1,var2;
    public int addition(int number1,int number2){
        return number1+number2;
	}
        public int substraction(int number1,int number2){
        return number1-number2;

    }

  public String demo()
 { 
	return "Hemant";
}
   public static int  multiplication(int number1,int number2)
	{
	return number1*number2;
	}
    public static void main(String args[]){
        Calculation cal=new Calculation();
       int add= cal.addition(20,30);
       System.out.println("Addition is="+add);

       int sub=cal.substraction(50,20);
       System.out.println("Substraction"+sub);

	
System.out.println(cal.demo());
int mul=Calculation.multiplication(12,3);
System.out.println(mul);
var1=10;
var2=2;
System.out.println("dividion="+var1/var2);
    }
}