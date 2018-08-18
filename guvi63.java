import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner data = new Scanner(System.in);
int num, i, temp, small;
 
System.out.print("Enter number you want to enter:");
num = data.nextInt();
System.out.println("Enter " +num+ " number");

small = data.nextInt();
for (i=1; i < num; i++)
{
temp = data.nextInt();
if(temp > small)
continue;
else

small = temp;

}

System.out.println("Smallest Number is "+small);

}
}



	
