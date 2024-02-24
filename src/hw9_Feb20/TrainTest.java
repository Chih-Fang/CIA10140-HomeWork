package hw9_Feb20;


import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class TrainTest {

	public static void main(String[] args) {
		Train a=new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train b=new Train(1254, "區間", "屏東", "基隆", 700);
		Train c=new Train(118, "自強", "高雄", "台北", 500);
		Train d=new Train(1288, "區間", "新竹", "基隆", 400);
		Train e=new Train(122, "自強", "台中", "花蓮", 600);
		Train f=new Train(1222, "區間", "樹林", "七堵", 300);
		Train g=new Train(1254, "區間", "屏東", "基隆", 700);
		

//		
//		請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出
		
		PriorityQueue<Train> q=new PriorityQueue<>();
		q.offer(e);
		q.offer(b);
		q.offer(d);
		q.offer(a);
		q.offer(c);
		q.offer(f);
		q.offer(g);
		
		
		//傳統for迴圈
		for(int i=q.size();i>0;i--) {
			
			Train train=q.poll();
			System.out.println(train.getEverything());
		}
		
		System.out.println("===========================");
		
//		請寫一隻程式,能印出不重複的Train物件
		TreeSet <Train>set=new TreeSet<>();
		set.add(a);
		set.add(e);
		set.add(f);
		set.add(b);
		set.add(d);
		set.add(g);
		set.add(c);
		
		//for each
		for(Train elemTrain:set) {
			System.out.println(elemTrain.getEverything());
	
		}
		
		System.out.println("===========迭代器==============");
		//迭代器
		Iterator<Train> it=set.iterator();
		while(it.hasNext()) {
			Train train2=it.next();
			System.out.println(train2.getEverything());
		}
		
		
	
		}
		
		

	

	}
	
	


