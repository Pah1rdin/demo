package HomeWork;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class cjcx {
	
		LinkedList<HashMap<String, Integer>> list= new	LinkedList<HashMap<String, Integer>>();
		HashMap<String, Integer> m1 = new HashMap<String, Integer>();
		HashMap<String, Integer> m2 = new HashMap<String, Integer>();
		HashMap<String, Integer> m3= new HashMap<String, Integer>();
		HashMap<String, Integer> m4 = new HashMap<String, Integer>();
		Scanner scan =new Scanner (System.in);
		public void map(){
						m1.put("张三", 80);
						m1.put("李四", 65);
						m1.put("王五", 35);
						m1.put("薛六", 90);
						m1.put("赵七", 70);
	   
					    m2.put("张三", 88);
						m2.put("李四", 75);
						m2.put("王五", 45);
						m2.put("薛六", 92);
						m2.put("赵七", 75);
	    
	   
					    m3.put("张三", 86);
						m3.put("李四", 67);
						m3.put("王五", 55);
						m3.put("薛六", 98);
						m3.put("赵七", 65);
	   
					    m4.put("张三", 88);
						m4.put("李四", 80);
						m4.put("王五", 59);
						m4.put("薛六", 88);
						m4.put("赵七", 68);
						
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
	}
	public void chaxun1(){
		 System.out.println("请输入您要查询的考试次数");
         int i1=scan.nextInt();
         HashMap hm=list.get(i1-1);
         int grade=0;
         Set<Entry<String,Integer>> set = hm.entrySet();
 		for(Entry<String,Integer> entry : set){
 			String key = entry.getKey();
 			int value = entry.getValue();
 			grade+=value;
 		}
        System.out.println("第"+i1+"次考试的总成绩为"+grade); 
         
	
	}
	public void chaxun2(){
		System.out.println("请输入您要查询学生的姓名");
   	 String name=scan.next();
   	 int grade =0;
   	 for(int i=0;i<4;i++)
   	 {
   		 grade+=list.get(i).get(name);
   	 }
   	 System.out.println(name+"考试的总成绩为"+grade); 
    }
	 public void chaxun3()
     {
    	 System.out.println("请输入您要查询的同学名字");
    	 String name=scan.next();
    	 int grade=0;
    	 for(int i=0;i<4;i++)
    	 {
    		 grade+=list.get(i).get(name);
    	 }
    	 System.out.println(name+"考试的平均成绩为"+grade/4); 
     }
     
     
     public void chaxun4()
     {
        int[] a=new int[4];
         for(int i=0;i<4;i++)
         { 
        	 HashMap hm=list.get(i);
        	 int grade=0;
         Set<Entry<String,Integer>> set = hm.entrySet();
 		for(Entry<String,Integer> entry : set){
 			String key = entry.getKey();
 			int value = entry.getValue();
 			grade+=value;
 		}
 		  a[i]=grade/5;
 		  System.out.println("第"+(i+1)+"次考试平均分为"+grade/5);}
       
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
     
     
     public void chaxun5()
     {  
    	 System.out.println("请输入您要查询的考试次数");
         int i1=scan.nextInt();
    	 HashMap hm=list.get(i1-1);
    	 System.out.println("请输入您要查询的同学名字");
    	 String name=scan.next();
    	 System.out.println(name+"第"+i1+"次考试的成绩为"+hm.get(name));
     }
     
     
     public void chaxun6()
     {
    	 System.out.println("请输入您要查询的考试次数");
         int i1=scan.nextInt();
         HashMap h=list.get(i1-1);
         if(h.get("张三").equals(null))
         {
        	 System.out.println("不存在张三的成绩");
         }
         else
         {
        	 System.out.println("张三第"+i1+"次的考试成绩为"+h.get("张三"));
         }
     }
     
     
     public void chaxun7()
     {
    	 System.out.println("请输入您要查询的考试次数");
         int i1=scan.nextInt();
         HashMap hm=list.get(i1-1);
         int k=0;
         Set<Entry<String,Integer>> set = hm.entrySet();
 		for(Entry<String,Integer> entry : set){
 			String key = entry.getKey();
 			int value = entry.getValue();
 			if (value==100)
 			{k++;}
 		}
    	 if(k==0)
    	 {
		 System.out.println("没有满分的学生");}
    	 else
    		 {System.out.println("有"+k+"个满分的学生");}
			
     }
	}
