import java.util.*;
import java.io.*;
import java.lang.*;
import java.text.SimpleDateFormat;
/* �����ƾ�� �̿��� ��� ���α׷�
 �ڹ� ���α׷� �ۼ��� 
 S152446 �ѻ��*/

public class Test1003{

	public static void main(String args[]) throws IOException
	  {
		   subroutinea objecta = new subroutinea();
		    objecta.test170();
			   subroutineb objectb = new subroutineb();
			    objectb.test171();
				   subroutinec objectc = new subroutinec();
				    objectc.test172();
					   subroutined objectd = new subroutined();
					    objectd.test173();
						   subroutinee objecte = new subroutinee();
						    objecte.test174();
							   subroutinef objectf = new subroutinef();
							    objectf.test175();
					
	  }
}

class subroutinea{
  public static void test170() throws IOException //1~10���� ���ϴ� ���α׷�
  {
	String name, pname;
	int result = 0;
    System.out.println("==========================");
    System.out.println("�� ���α׷��� 1���� 10���� ���ϴ� �ڹ� ���α׷��Դϴ�. [Test170]");
    BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in)); 
    System.out.print("�ڹ� ���α׷��� �̸��� �Է��Ͻÿ�?");
    name = inbr.readLine(); 
    System.out.print("�ǽ� �ڹ� ���α׷��̸��� �Է��Ͻÿ�?");
    pname = inbr.readLine(); 
    for (int i=1;i<=10;i++)
    {
    	result = result + i;
    	System.out.println(result);
    }
    System.out.println("1���� 10���� ���� ����" + result + "�Դϴ�.");
    System.out.println("�ڹ� ���α׷��� " + name + " �Դϴ�.");
    System.out.println("�ڹ� ���α׷�  " + pname + " �Դϴ�.");
    System.out.println("�����մϴ�.");
    System.out.println("==========================");
    }
  }

class subroutineb{
  public static void test171() throws IOException // 1~1����� ���ϰ� �ð��� ���ϴ� ���α׷�
  {
	String name, pname;
	double result=0, max=100000000;
	
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
    
    for (double i = 1; i<=max; i++)
    {
    	
    	result += i;
    	
    }
    System.out.println("1���� 1����� ���� ����" + result + "�Դϴ�.");
	long end = System.currentTimeMillis(); 
	SimpleDateFormat endTime = new SimpleDateFormat("���� �ð��� yyyy�� MM�� dd�� HH�� mm�� ss.SSS�� (1/1000)�� �Դϴ�."); 
	String strED = endTime.format(new Date(end)); 
    System.out.println(strED); 
    System.out.println("�ڹ� ���α׷��� " + name + " �Դϴ�.");
    System.out.println("�ڹ� ���α׷�  " + pname + " �Դϴ�.");
    System.out.println("�����մϴ�.");
    System.out.println("==========================");
    }
}

class subroutinec{
public static void test172() throws IOException // 1~10����� ���� ���� �ð��� üũ�ϴ� ���α׷�
{
	String name, pname;
	double result=0, max=1000000000; //10��
	
  System.out.println("==========================");
  System.out.println("�� ���α׷��� 10����� ���� ���� �ð��� check�ϴ� �ڹ� ���α׷� [Test172]");
  BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in)); 
  System.out.print("�ڹ� ���α׷��� �̸��� �Է��Ͻÿ�?");
  name = inbr.readLine(); 
  System.out.print("�ǽ� �ڹ� ���α׷��̸��� �Է��Ͻÿ�?");
  pname = inbr.readLine(); 
	long start = System.currentTimeMillis(); 
	SimpleDateFormat startTime = new SimpleDateFormat("���� �ð��� yyyy�� MM�� dd�� HH�� mm�� ss.SSS�� (1/1000)�� �Դϴ�."); 
	String strST = startTime.format(new Date(start)); 
  System.out.println(strST); 
  
  for (double i = 1; i<=max; i++)
  {
  	result += i;

  }
  System.out.println("1���� 10����� ���� ����" + result + "�Դϴ�.");
	long end = System.currentTimeMillis(); 
	SimpleDateFormat endTime = new SimpleDateFormat("���� �ð��� yyyy�� MM�� dd�� HH�� mm�� ss.SSS�� (1/1000)�� �Դϴ�."); 
	String strED = endTime.format(new Date(end)); 
  System.out.println(strED); 
  System.out.println("�ڹ� ���α׷��� " + name + " �Դϴ�.");
  System.out.println("�ڹ� ���α׷�  " + pname + " �Դϴ�.");
  System.out.println("�����մϴ�.");
  System.out.println("==========================");
  }
}

class subroutined{
public static void test173() throws IOException // 1~100����� ���ϸ鼭 ������ �����ϴ� ���α׷�
{
	String name, pname;
	double result=0, max=10000000000.0; //100��
	
  System.out.println("==========================");
  System.out.println("�� ���α׷��� 100����� ���ϸ鼭 ������ �����ϴ� ���α׷� [Test173]");
  BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in)); 
  System.out.print("�ڹ� ���α׷��� �̸��� �Է��Ͻÿ�?");
  name = inbr.readLine(); 
  System.out.print("�ǽ� �ڹ� ���α׷��̸��� �Է��Ͻÿ�?");
  pname = inbr.readLine(); 
  
  for (double i = 1; i<=max; i++)
  {
	if (i==1000000000) System.out.println("10����� ���߽��ϴ�.");
	else if (i==2000000000) System.out.println("20����� ���߽��ϴ�.");
	else if (i==3000000000.0) System.out.println("30����� ���߽��ϴ�.");
	else if (i==4000000000.0) System.out.println("40����� ���߽��ϴ�.");
	else if (i==5000000000.0) System.out.println("50����� ���߽��ϴ�.");
	else if (i==6000000000.0) System.out.println("60����� ���߽��ϴ�.");
	else if (i==7000000000.0) System.out.println("70����� ���߽��ϴ�.");
	else if (i==8000000000.0) System.out.println("80����� ���߽��ϴ�.");
	else if (i==9000000000.0) System.out.println("90����� ���߽��ϴ�.");
	else if (i==10000000000.0) System.out.println("100����� ���߽��ϴ�.");

	
	
  	result += i;
  	
  
  }
  System.out.println("1���� 100����� ���� ���� " + result + " �Դϴ�."); 
  System.out.println("�ڹ� ���α׷��� " + name + " �Դϴ�.");
  System.out.println("�ڹ� ���α׷�  " + pname + " �Դϴ�.");
  System.out.println("�����մϴ�.");
  System.out.println("==========================");
  }
}

class subroutinee{
public static void test174() throws IOException // 1~100����� ���ϰ� �ð��� üũ�ϴ� ���α׷�
{
	String name, pname;
	double result=0, max=10000000000.0; //100��
	
  System.out.println("==========================");
  System.out.println("�� ���α׷��� 100����� ���� ���� �ð��� check�ϴ� �ڹ� ���α׷� [Test174]");
  BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in)); 
  System.out.print("�ڹ� ���α׷��� �̸��� �Է��Ͻÿ�?");
  name = inbr.readLine(); 
  System.out.print("�ǽ� �ڹ� ���α׷��̸��� �Է��Ͻÿ�?");
  pname = inbr.readLine(); 
	long start = System.currentTimeMillis(); 
	SimpleDateFormat startTime = new SimpleDateFormat("���� �ð��� yyyy�� MM�� dd�� HH�� mm�� ss.SSS�� (1/1000)�� �Դϴ�."); 
	String strST = startTime.format(new Date(start)); 
  System.out.println(strST); 
  
  for (double i = 1; i<=max; i++)
  {
	if (i==1000000000) System.out.println("10����� ���߽��ϴ�.");
	else if (i==2000000000) System.out.println("20����� ���߽��ϴ�.");
	else if (i==3000000000.0) System.out.println("30����� ���߽��ϴ�.");
	else if (i==4000000000.0) System.out.println("40����� ���߽��ϴ�.");
	else if (i==5000000000.0) System.out.println("50����� ���߽��ϴ�.");
	else if (i==6000000000.0) System.out.println("60����� ���߽��ϴ�.");
	else if (i==7000000000.0) System.out.println("70����� ���߽��ϴ�.");
	else if (i==8000000000.0) System.out.println("80����� ���߽��ϴ�.");
	else if (i==9000000000.0) System.out.println("90����� ���߽��ϴ�.");
	else if (i==10000000000.0) System.out.println("100����� ���߽��ϴ�.");

	
	
  	result += i;
  	
  
  }
  System.out.println("1���� 100����� ���� ����" + result + "�Դϴ�.");
	long end = System.currentTimeMillis(); 
	SimpleDateFormat endTime = new SimpleDateFormat("���� �ð��� yyyy�� MM�� dd�� HH�� mm�� ss.SSS�� (1/1000)�� �Դϴ�."); 
	String strED = endTime.format(new Date(end)); 
  System.out.println(strED); 
  System.out.println("�ڹ� ���α׷��� " + name + " �Դϴ�.");
  System.out.println("�ڹ� ���α׷�  " + pname + " �Դϴ�.");
  System.out.println("�����մϴ�.");
  System.out.println("==========================");
  }
}

class subroutinef{
public static void test175() throws IOException // 1~100����� ���ϰ� �����ϸ� �ɸ� �ð� ����ϴ� ���α׷�
{
	String name, pname;
	double result=0, max=10000000000.0; //100��
	
  System.out.println("==========================");
  System.out.println("�� ���α׷��� 1���� 100��(10,000,000,000)���� ���ϰ�, ��� ���� �ð��� check�ϴ� ���α׷� [Test175]");
  BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in)); 
  System.out.print("�ڹ� ���α׷��� �̸��� �Է��Ͻÿ�?");
  name = inbr.readLine(); 
  System.out.print("�ǽ� �ڹ� ���α׷��̸��� �Է��Ͻÿ�?");
  pname = inbr.readLine(); 
	long start = System.currentTimeMillis(); 
	SimpleDateFormat startTime = new SimpleDateFormat("���� �ð��� yyyy�� MM�� dd�� HH�� mm�� ss.SSS�� (1/1000)�� �Դϴ�."); 
	String strST = startTime.format(new Date(start)); 
  System.out.println(strST); 
  
  for (double i = 1; i<=max; i++)
  {
	if (i==1000000000) System.out.println("10����� ���߽��ϴ�.");
	else if (i==2000000000) System.out.println("20����� ���߽��ϴ�.");
	else if (i==3000000000.0) System.out.println("30����� ���߽��ϴ�.");
	else if (i==4000000000.0) System.out.println("40����� ���߽��ϴ�.");
	else if (i==5000000000.0) System.out.println("50����� ���߽��ϴ�.");
	else if (i==6000000000.0) System.out.println("60����� ���߽��ϴ�.");
	else if (i==7000000000.0) System.out.println("70����� ���߽��ϴ�.");
	else if (i==8000000000.0) System.out.println("80����� ���߽��ϴ�.");
	else if (i==9000000000.0) System.out.println("90����� ���߽��ϴ�.");
	else if (i==10000000000.0) System.out.println("100����� ���߽��ϴ�.");

	
	
  	result += i;
  	
  
  }
	long end = System.currentTimeMillis(); 
	SimpleDateFormat endTime = new SimpleDateFormat("���� �ð��� yyyy�� MM�� dd�� HH�� mm�� ss.SSS�� (1/1000)�� �Դϴ�."); 
	String strED = endTime.format(new Date(end)); 
	System.out.println(strED); 
	
  System.out.println("1���� 100����� ���� ����" + result + "�Դϴ�.");
	long task = end-start;
	SimpleDateFormat taskTime = new SimpleDateFormat("100����� ���� �� �ɸ� �ð���  HH�� mm�� ss.SSS (1/1000)�� �Դϴ�."); 
	taskTime.setTimeZone(TimeZone.getTimeZone("GMT")); 
	String strTK = taskTime.format(new Date(task)); 
	System.out.println(strTK); 
  System.out.println("�ڹ� ���α׷��� " + name + " �Դϴ�.");
  System.out.println("�ڹ� ���α׷�  " + pname + " �Դϴ�.");
  System.out.println("�����մϴ�.");
  System.out.println("==========================");
  }
}


