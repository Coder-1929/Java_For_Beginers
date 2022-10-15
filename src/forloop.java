import java.util.Scanner;

public class Main {
//    Provided the userinput option so that numbers can be printed in both orders

    public static void main(String[] args)
    {
        System.out.println("Press 1 if you want to print the number in ascending order"); // Asked user input for their choice
        Scanner S1=new Scanner(System.in);
        int input=S1.nextInt();//taking user input

        if(input==1)//selecting as per the userinput
        {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }
        else
        {
            for (int j = 10; j >= 0; j--) {
                System.out.println(j);
            }
        }
    }
}
