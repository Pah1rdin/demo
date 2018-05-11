package ClassTest;
import java.util.Scanner;
public class Map {

	public static void main(String[] args)
	{
		boolean bol=true;
		while(bol)
		{
	    System.out.println("欢迎进入学生成绩管理系统：");
		System.out.println("1.查询某次考试的总成绩");
		System.out.println("2.查询某个学生的总成绩");
		System.out.println("3.查询某个学生的平均成绩");
		System.out.println("4.查询全班平均分最高的一次考试成绩");
		System.out.println("5.查询某个学生的某次考试成绩");
		System.out.println("6.查询某次考试时是否存在张三的成绩");
		System.out.println("7.查询某次考试是否有考满分的学生");
		System.out.println("8.退出系统");
		System.out.println("请输入您要使用的功能序号");
		Scanner scan=new Scanner(System.in);
		MapMethod m=new MapMethod();
		m.map();
		int i=scan.nextInt();
		switch(i)
		{
		case 1:m.method1();break;
		case 2:m.method2();break;
		case 3:m.method3();break;
		case 4:m.method4();break;
		case 5:m.method5();break;
		case 6:m.method6();break;
		case 7:m.method7();break;
		case 8:System.out.println("欢迎下次使用");bol=false;break;
		default:System.out.println("请输入正确的序号");break;
		}
	}
}
}