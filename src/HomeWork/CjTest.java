package HomeWork;

import java.util.HashMap;
import java.util.Scanner;

import ClassTest.MapMethod;


public class CjTest {
public static void main(String[] args){

	Scanner scan=new Scanner (System.in);
	boolean bol=true;
	while(bol){
	System.out.println("******成绩查询系统***" );
	System.out.println("********1.查询某次考试的总成绩***********");
	System.out.println("********2.查询某个学生的总成绩***********");
	System.out.println("********3.查询某个学生的平均成绩***********");
	System.out.println("********4.查询全班平均分最高的一次考试成绩是哪次，并输出平均成绩的具体值***********");
	System.out.println("********5.查询某个学生的某次考试成绩*********");
	System.out.println("********6.查询某次考试时是否存在张三的成绩*******");		
	System.out.println("********7.查询某次考试是否有考满分的学生********");  
	System.out.println("********8.退出系统********"); //在这里用到的while 语句的原因是等用户输入6的时候，防止循环的进行。
	System.out.println("请输入您要使用的功能序号");
	cjcx cj =new cjcx();
	cj.map();
	int i=scan.nextInt();

	switch(i){		
			
	case(1):
			
	break;
 
	case(2):cj.chaxun2();
		
	break;
	
	case(3):cj.chaxun3();
	
	case(4):cj.chaxun4();
	
	break;
	
	case(5):cj.chaxun5();
	
	break;
	case(6):cj.chaxun6();
	

	case(7):cj.chaxun7();
		
	case(8):
		System.out.println("已成功退出系统，谢谢使用！");
		bol=false;
		break;
	
	default:
			System.out.println("请输入功能序列号");
	
	break;
	}
	
}
}
}

