package ClassTest;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsTest {
	
	public static void main(String[] args) {
		
		//不会排序 不会去掉重复
		//list set
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(300);
		list.add(200);
		list.add(100);
		list.add(700);
		list.add(500);
		list.add(600);
		list.add(600);
		
		//求最大值
		//最大值
		int max = Collections.max(list);	
		//list有顺序了
		Collections.sort(list);
		System.out.println(list);
		
		//上班（老板  给我创造多少价值 ） 冲突  学习 （提高自己   挣更多的钱  走向更高的岗位）
		// 
	}

}
