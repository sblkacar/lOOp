import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int inputUser;
        Scanner input=new Scanner(System.in);
        inputUser=input.nextInt();
        for (int i=0; i<=inputUser; i++)
        {
            if(i%2==0)
            {
                System.out.println(i+"");
            }

        }

    }
}
