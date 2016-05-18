import java.util.*;
import java.io.*;
import java.lang.*;
import java.text.SimpleDateFormat;
/* 서브루틴을 이용한 계산 프로그램
 자바 프로그램 작성자 
 S152446 한상우*/

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
  public static void test170() throws IOException //1~10까지 더하는 프로그램
  {
	String name, pname;
	int result = 0;
    System.out.println("==========================");
    System.out.println("이 프로그램은 1부터 10까지 더하는 자바 프로그램입니다. [Test170]");
    BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in)); 
    System.out.print("자바 프로그래머 이름을 입력하시오?");
    name = inbr.readLine(); 
    System.out.print("실습 자바 프로그램이름을 입력하시오?");
    pname = inbr.readLine(); 
    for (int i=1;i<=10;i++)
    {
    	result = result + i;
    	System.out.println(result);
    }
    System.out.println("1부터 10까지 더한 값은" + result + "입니다.");
    System.out.println("자바 프로그래머 " + name + " 입니다.");
    System.out.println("자바 프로그램  " + pname + " 입니다.");
    System.out.println("감사합니다.");
    System.out.println("==========================");
    }
  }

class subroutineb{
  public static void test171() throws IOException // 1~1억까지 더하고 시간을 구하는 프로그램
  {
	String name, pname;
	double result=0, max=100000000;
	
    System.out.println("==========================");
    System.out.println("이 프로그램은 1억까지 더한 값과 시간을 check하는 자바 프로그램 [Test171]");
    BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in)); 
    System.out.print("자바 프로그래머 이름을 입력하시오?");
    name = inbr.readLine(); 
    System.out.print("실습 자바 프로그램이름을 입력하시오?");
    pname = inbr.readLine(); 
	long start = System.currentTimeMillis(); 
	SimpleDateFormat startTime = new SimpleDateFormat("현재 시간은 yyyy년 MM월 dd일 HH시 mm분 ss.SSS초 (1/1000)초 입니다."); 
	String strST = startTime.format(new Date(start)); 
    System.out.println(strST); 
    
    for (double i = 1; i<=max; i++)
    {
    	
    	result += i;
    	
    }
    System.out.println("1부터 1억까지 더한 값은" + result + "입니다.");
	long end = System.currentTimeMillis(); 
	SimpleDateFormat endTime = new SimpleDateFormat("종료 시간은 yyyy년 MM월 dd일 HH시 mm분 ss.SSS초 (1/1000)초 입니다."); 
	String strED = endTime.format(new Date(end)); 
    System.out.println(strED); 
    System.out.println("자바 프로그래머 " + name + " 입니다.");
    System.out.println("자바 프로그램  " + pname + " 입니다.");
    System.out.println("감사합니다.");
    System.out.println("==========================");
    }
}

class subroutinec{
public static void test172() throws IOException // 1~10억까지 더한 값과 시간을 체크하는 프로그램
{
	String name, pname;
	double result=0, max=1000000000; //10억
	
  System.out.println("==========================");
  System.out.println("이 프로그램은 10억까지 더한 값과 시간을 check하는 자바 프로그램 [Test172]");
  BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in)); 
  System.out.print("자바 프로그래머 이름을 입력하시오?");
  name = inbr.readLine(); 
  System.out.print("실습 자바 프로그램이름을 입력하시오?");
  pname = inbr.readLine(); 
	long start = System.currentTimeMillis(); 
	SimpleDateFormat startTime = new SimpleDateFormat("현재 시간은 yyyy년 MM월 dd일 HH시 mm분 ss.SSS초 (1/1000)초 입니다."); 
	String strST = startTime.format(new Date(start)); 
  System.out.println(strST); 
  
  for (double i = 1; i<=max; i++)
  {
  	result += i;

  }
  System.out.println("1부터 10억까지 더한 값은" + result + "입니다.");
	long end = System.currentTimeMillis(); 
	SimpleDateFormat endTime = new SimpleDateFormat("종료 시간은 yyyy년 MM월 dd일 HH시 mm분 ss.SSS초 (1/1000)초 입니다."); 
	String strED = endTime.format(new Date(end)); 
  System.out.println(strED); 
  System.out.println("자바 프로그래머 " + name + " 입니다.");
  System.out.println("자바 프로그램  " + pname + " 입니다.");
  System.out.println("감사합니다.");
  System.out.println("==========================");
  }
}

class subroutined{
public static void test173() throws IOException // 1~100억까지 더하면서 실행을 점검하는 프로그램
{
	String name, pname;
	double result=0, max=10000000000.0; //100억
	
  System.out.println("==========================");
  System.out.println("이 프로그램은 100억까지 더하면서 실행을 점검하는 프로그램 [Test173]");
  BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in)); 
  System.out.print("자바 프로그래머 이름을 입력하시오?");
  name = inbr.readLine(); 
  System.out.print("실습 자바 프로그램이름을 입력하시오?");
  pname = inbr.readLine(); 
  
  for (double i = 1; i<=max; i++)
  {
	if (i==1000000000) System.out.println("10억까지 더했습니다.");
	else if (i==2000000000) System.out.println("20억까지 더했습니다.");
	else if (i==3000000000.0) System.out.println("30억까지 더했습니다.");
	else if (i==4000000000.0) System.out.println("40억까지 더했습니다.");
	else if (i==5000000000.0) System.out.println("50억까지 더했습니다.");
	else if (i==6000000000.0) System.out.println("60억까지 더했습니다.");
	else if (i==7000000000.0) System.out.println("70억까지 더했습니다.");
	else if (i==8000000000.0) System.out.println("80억까지 더했습니다.");
	else if (i==9000000000.0) System.out.println("90억까지 더했습니다.");
	else if (i==10000000000.0) System.out.println("100억까지 더했습니다.");

	
	
  	result += i;
  	
  
  }
  System.out.println("1부터 100억까지 더한 값은 " + result + " 입니다."); 
  System.out.println("자바 프로그래머 " + name + " 입니다.");
  System.out.println("자바 프로그램  " + pname + " 입니다.");
  System.out.println("감사합니다.");
  System.out.println("==========================");
  }
}

class subroutinee{
public static void test174() throws IOException // 1~100억까지 더하고 시간을 체크하는 프로그램
{
	String name, pname;
	double result=0, max=10000000000.0; //100억
	
  System.out.println("==========================");
  System.out.println("이 프로그램은 100억까지 더한 값과 시간을 check하는 자바 프로그램 [Test174]");
  BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in)); 
  System.out.print("자바 프로그래머 이름을 입력하시오?");
  name = inbr.readLine(); 
  System.out.print("실습 자바 프로그램이름을 입력하시오?");
  pname = inbr.readLine(); 
	long start = System.currentTimeMillis(); 
	SimpleDateFormat startTime = new SimpleDateFormat("현재 시간은 yyyy년 MM월 dd일 HH시 mm분 ss.SSS초 (1/1000)초 입니다."); 
	String strST = startTime.format(new Date(start)); 
  System.out.println(strST); 
  
  for (double i = 1; i<=max; i++)
  {
	if (i==1000000000) System.out.println("10억까지 더했습니다.");
	else if (i==2000000000) System.out.println("20억까지 더했습니다.");
	else if (i==3000000000.0) System.out.println("30억까지 더했습니다.");
	else if (i==4000000000.0) System.out.println("40억까지 더했습니다.");
	else if (i==5000000000.0) System.out.println("50억까지 더했습니다.");
	else if (i==6000000000.0) System.out.println("60억까지 더했습니다.");
	else if (i==7000000000.0) System.out.println("70억까지 더했습니다.");
	else if (i==8000000000.0) System.out.println("80억까지 더했습니다.");
	else if (i==9000000000.0) System.out.println("90억까지 더했습니다.");
	else if (i==10000000000.0) System.out.println("100억까지 더했습니다.");

	
	
  	result += i;
  	
  
  }
  System.out.println("1부터 100억까지 더한 값은" + result + "입니다.");
	long end = System.currentTimeMillis(); 
	SimpleDateFormat endTime = new SimpleDateFormat("종료 시간은 yyyy년 MM월 dd일 HH시 mm분 ss.SSS초 (1/1000)초 입니다."); 
	String strED = endTime.format(new Date(end)); 
  System.out.println(strED); 
  System.out.println("자바 프로그래머 " + name + " 입니다.");
  System.out.println("자바 프로그램  " + pname + " 입니다.");
  System.out.println("감사합니다.");
  System.out.println("==========================");
  }
}

class subroutinef{
public static void test175() throws IOException // 1~100억까지 더하고 점검하며 걸린 시간 계산하는 프로그램
{
	String name, pname;
	double result=0, max=10000000000.0; //100억
	
  System.out.println("==========================");
  System.out.println("이 프로그램은 1부터 100억(10,000,000,000)까지 더하고, 계산 실행 시간을 check하는 프로그램 [Test175]");
  BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in)); 
  System.out.print("자바 프로그래머 이름을 입력하시오?");
  name = inbr.readLine(); 
  System.out.print("실습 자바 프로그램이름을 입력하시오?");
  pname = inbr.readLine(); 
	long start = System.currentTimeMillis(); 
	SimpleDateFormat startTime = new SimpleDateFormat("현재 시간은 yyyy년 MM월 dd일 HH시 mm분 ss.SSS초 (1/1000)초 입니다."); 
	String strST = startTime.format(new Date(start)); 
  System.out.println(strST); 
  
  for (double i = 1; i<=max; i++)
  {
	if (i==1000000000) System.out.println("10억까지 더했습니다.");
	else if (i==2000000000) System.out.println("20억까지 더했습니다.");
	else if (i==3000000000.0) System.out.println("30억까지 더했습니다.");
	else if (i==4000000000.0) System.out.println("40억까지 더했습니다.");
	else if (i==5000000000.0) System.out.println("50억까지 더했습니다.");
	else if (i==6000000000.0) System.out.println("60억까지 더했습니다.");
	else if (i==7000000000.0) System.out.println("70억까지 더했습니다.");
	else if (i==8000000000.0) System.out.println("80억까지 더했습니다.");
	else if (i==9000000000.0) System.out.println("90억까지 더했습니다.");
	else if (i==10000000000.0) System.out.println("100억까지 더했습니다.");

	
	
  	result += i;
  	
  
  }
	long end = System.currentTimeMillis(); 
	SimpleDateFormat endTime = new SimpleDateFormat("종료 시간은 yyyy년 MM월 dd일 HH시 mm분 ss.SSS초 (1/1000)초 입니다."); 
	String strED = endTime.format(new Date(end)); 
	System.out.println(strED); 
	
  System.out.println("1부터 100억까지 더한 값은" + result + "입니다.");
	long task = end-start;
	SimpleDateFormat taskTime = new SimpleDateFormat("100억까지 더할 때 걸린 시간은  HH시 mm분 ss.SSS (1/1000)초 입니다."); 
	taskTime.setTimeZone(TimeZone.getTimeZone("GMT")); 
	String strTK = taskTime.format(new Date(task)); 
	System.out.println(strTK); 
  System.out.println("자바 프로그래머 " + name + " 입니다.");
  System.out.println("자바 프로그램  " + pname + " 입니다.");
  System.out.println("감사합니다.");
  System.out.println("==========================");
  }
}


