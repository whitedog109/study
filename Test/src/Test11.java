import java.util.*;
import java.io.*;
import java.lang.*;
import java.text.SimpleDateFormat;

public class Test11{

	public static void main(String args[]) throws IOException
	  {
	String name, pname;
	long result=0, max=100000000;
	
    System.out.println("==========================");
    System.out.println("�� ���α׷��� 1����� ���� ���� �ð��� check�ϴ� �ڹ� ���α׷� [Test171]");
    BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in)); 
    System.out.print("�ڹ� ���α׷��� �̸��� �Է��Ͻÿ�?");
    name = inbr.readLine(); 
    System.out.print("�ǽ� �ڹ� ���α׷��̸��� �Է��Ͻÿ�?");
    pname = inbr.readLine(); 
	long start = System.currentTimeMillis(); 
	SimpleDateFormat startTime = new SimpleDateFormat("���� �ð��� yyyy�� MM�� dd�� HH�� mm�� ss.SSS�� (1/1000)�� �Դϴ�."); 
	String strST = startTime.format(new Date(start)); 
    System.out.println(strST); 
    
    for (long i = 1; i<=max; i++)
    {
    	System.out.println(result);
    	System.out.println(i);
    	
    	result += i;
    	
    }
	  }
}