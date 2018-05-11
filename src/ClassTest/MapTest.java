package ClassTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
	
	public static void main(String[] args) {
		
		//数据结构
		//装两个值Integer  key  String value
		//key-value  == 键值对   json
		//重点存储的是value
		//需要通过key去操作value
		//key不能重复  value可以重复
		//HashMap 允许存放null 键  null值
		
		//没有顺序的  没有索引的    数据管理（更好的性能）
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		//添加数据
		map.put(1, "张三");
		map.put(2, "李四");
		map.put(3, "王五");
		map.put(4, "小强");
		map.put(5, "小明");
		
	/*	//null
		//散列图
		map.put(null, null);
		
		
		//修改
		//不能修改
		map.put(3, "李四");
		
		//删除
		//map.remove(3);
		map.remove(null);
		
		
		//查询
		//System.out.println(map);
		
		//获取一个
		String value = map.get(2);
		System.out.println(value);
		
		//判断指定的key是否存在
		boolean bol1 = map.containsKey(6);
		System.out.println(bol1);
		
		//判断指定的value是否存在
		boolean bol2 = map.containsValue("小红");
		System.out.println(bol2);*/
		
		//重点map的遍历 （考试必考）
		//2种遍历方法
		
		//1.先获取所有的key  在通过key 获取指定的value
		//keySet()  返回map中所有的key 装到一个set里  因为key不能重复
		//效率比较低
		/*Set<Integer> set = map.keySet();
		for(int key : set){
			String value = map.get(key);
			System.out.println(key+"-"+value);
		}*/
		
		//entrySet(); set  装了一个比较特殊的类  map底层实现类（遍历辅助类   EnTry）
		//同时去除key和value
		Set<Entry<Integer,String>> set = map.entrySet();
		for(Entry<Integer,String> entry : set){
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+"-"+value);
		}
	}

}
