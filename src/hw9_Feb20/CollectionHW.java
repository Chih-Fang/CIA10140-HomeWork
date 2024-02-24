package hw9_Feb20;

import java.math.BigInteger;
import java.util.*;
import java.util.Iterator;

import hw6_Feb07.CalTest;

public class CollectionHW {

	public static void main(String[] args) {
//		請建立一個Collection物件並將以下資料加入:
//			Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//			Object物件、“Snoopy”、BigInteger(“1000”)
//
//			• 印出這個物件裡的所有元素(使用Iterator)
//			
		ArrayList collect = new ArrayList();
		collect.add(new Integer(100));
		collect.add(new Double(3.14));
		collect.add(new Long(21L));
		collect.add(new Short("100"));
		collect.add(new Double(5.1));
		collect.add("Kitty");
		collect.add(new Integer(100));
		collect.add(new Object());
		collect.add("Snoopy");
		collect.add(new BigInteger("1000"));

//		• 印出這個物件裡的所有元素(foreach)
		Iterator it = collect.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

		System.out.println("\n" + "============for each=========================");

		for (Object element : collect)
			System.out.print(element + " ");

		System.out.println("\n" + "============傳統for迴圈========================");
//		• 印出這個物件裡的所有元素(傳統for迴圈)
		for (int i = 0; i < collect.size(); i++) {
			System.out.print(collect.get(i) + " ");
		}

		System.out.println("\n" + "=========移除不是java.lang.Number相關的物件============");

		CollectionHW a = new CollectionHW();
		a.findNum(collect);
		System.out.println("移除所有非number類型的集合裡還剩下: " + collect.toString());

//		• 再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功

	}

	public void findNum(ArrayList test) {
		Iterator it = test.listIterator();
		while (it.hasNext()) {
			Object obj = it.next();
			if (!(obj instanceof Number)) {
				it.remove();
			}
		}

	}
	
	
	

}
