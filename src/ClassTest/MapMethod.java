package ClassTest;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;
public class MapMethod {

	
	HashMap<String,Integer> map1 = new HashMap<String,Integer>();
	HashMap<String,Integer> map2 = new HashMap<String,Integer>();
	HashMap<String,Integer> map3 = new HashMap<String,Integer>();
	HashMap<String,Integer> map4 = new HashMap<String,Integer>();
	LinkedList<HashMap<String,Integer>> list=new LinkedList<HashMap<String,Integer>> ();
	Scanner scan=new Scanner(System.in);
	
	public void map()
	{
	
	map1.put("张三",80);
	map1.put("李四",65);
	map1.put("王五",35);
	map1.put("薛六",90);
	map1.put("赵七",70);
	
	
	map2.put("张三",88);
	map2.put("李四",75);
	map2.put("王五",45);
	map2.put("薛六",92);
	map2.put("赵七",75);
	
	
	map3.put("张三",86);
	map3.put("李四",67);
	map3.put("王五",55);
	map3.put("薛六",98);
	map3.put("赵七",65);
	
	
	map4.put("张三",88);
	map4.put("李四",80);
	map4.put("王五",59);
	map4.put("薛六",88);
	map4.put("赵七",68);
	
	list.add(map1);
	list.add(map2);
	list.add(map3);
	list.add(map4);
	
	}
	
	
	
     public void method1()
     {
    	 System.out.println("请输入您要查询的考试次数");
         int j=scan.nextInt();
         HashMap h=list.get(j-1);
         int score=0;
         Set<Entry<String,Integer>> set = h.entrySet();
 		for(Entry<String,Integer> entry : set){
 			String key = entry.getKey();
 			int value = entry.getValue();
 			score+=value;
 		}
        System.out.println("第"+j+"次考试的总成绩为"+score); 
         
     }
     
    
     public void method2()
     {
    	 System.out.println("请输入您要查询的同学名字");
    	 String name=scan.next();
    	 int score=0;
    	 for(int i=0;i<4;i++)
    	 {
    		 score+=list.get(i).get(name);
    	 }
    	 System.out.println(name+"考试的总成绩为"+score); 
     }
     
     
     public void method3()
     {
    	 System.out.println("请输入您要查询的同学名字");
    	 String name=scan.next();
    	 int score=0;
    	 for(int i=0;i<4;i++)
    	 {
    		 score+=list.get(i).get(name);
    	 }
    	 System.out.println(name+"考试的平均成绩为"+score/4); 
     }
     
     
     public void method4()
     {
        int[] a=new int[4];
         for(int i=0;i<4;i++)
         { 
        	 HashMap h=list.get(i);
        	 int score=0;
         Set<Entry<String,Integer>> set = h.entrySet();
 		for(Entry<String,Integer> entry : set){
 			String key = entry.getKey();
 			int value = entry.getValue();
 			score+=value;
 		}
 		  a[i]=score/5;
 		  System.out.println("第"+(i+1)+"次考试平均分为"+score/5);}
       
         int max=0;
         int x=0;
         for(int i=0;i<4;i++)
         {
        	 if(a[i]>max)
        	 {
        		 max=a[i];
        		 x=i+1;
        	 }
         }
		  System.out.println("第"+x+"次考试平均分最高，为"+max);
     }
     
     
     public void method5()
     {  
    	 System.out.println("请输入您要查询的考试次数");
         int j=scan.nextInt();
    	 HashMap h=list.get(j-1);
    	 System.out.println("请输入您要查询的同学名字");
    	 String name=scan.next();
    	 System.out.println(name+"第"+j+"次考试的成绩为"+h.get(name));
     }
     
     
     public void method6()
     {
    	 System.out.println("请输入您要查询的考试次数");
         int j=scan.nextInt();
         HashMap h=list.get(j-1);
         if(h.get("张三").equals(null))
         {
        	 System.out.println("不存在张三的成绩");
         }
         else
         {
        	 System.out.println("张三第"+j+"次的考试成绩为"+h.get("张三"));
         }
     }
     
     
     public void method7()
     {
    	 System.out.println("请输入您要查询的考试次数");
         int j=scan.nextInt();
         HashMap h=list.get(j-1);
         int m=0;
         Set<Entry<String,Integer>> set = h.entrySet();
 		for(Entry<String,Integer> entry : set){
 			String key = entry.getKey();
 			int value = entry.getValue();
 			if (value==100)
 			{m++;}
 		}
    	 if(m==0)
    	 {
		 System.out.println("没有满分的学生");}
    	 else
    		 {System.out.println("有"+m+"个满分的学生");}
			
     }
}
