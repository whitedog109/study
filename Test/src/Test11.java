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
    
    for (long i = 1; i<=max; i++)
    {
    	System.out.println(result);
    	System.out.println(i);
    	
    	result += i;
    	
    }
	  }
}