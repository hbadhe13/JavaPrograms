import java.util.*;
public class Square {

    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int number[]=new int[5];
        System.out.println("Enter 5 numbers:\n");
        int i;
        {
            for(i=0;i<5;i++)
            {
                number[i]=scanner.nextInt();
            }
        }

        for(i=0;i<5;i++) {
            if (number[i] % 2 == 0) {
                int result = number[i] * number[i];
                System.out.println("\n Number["+i+"] : "+number[i]+" is Even and it's square is :"+result);
            }
            else {
                int cube=number[i]*number[i]*number[i];
                System.out.println("\n Number["+i+"] : "+number[i]+" is Odd and it's cube is :"+cube);
            }
        }
    }
}

