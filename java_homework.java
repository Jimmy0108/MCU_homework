import java.lang.*;
import java.util.Arrays;
import java.io.Console;
public class bublesort
{
    public static void main(String args[])
    {
        int sum = 0;
        Console console = System.console();
        int numarray[] = new int[10];
        for(int i=0;i<6;i++)
        {
            numarray[i] = Integer.parseInt(console.readLine());
        }
        /*for(int i=0;i<numarray.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(numarray[j] < numarray[j+1])
                {
                    int num = 0;
                    num = numarray[j];
                    numarray[j] = numarray[j+1];
                    numarray[j+1] = num;
                }
            }
        }*/
        Arrays.sort(numarray);
        for(int i=0;i<numarray.length;i++)
        {
            System.out.println(numarray[i] + " ");
        }
    }
}
