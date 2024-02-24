package hw9_Feb20;

import java.util.Objects;



public class Train implements Comparable<Train>{
	
//	請設計一個Train類別,並包含以下屬性:
//		- 班次 number,型別為int - 車種 type,型別為String - 出發地 start,型別為String
//		- 目的地 dest,型別為String - 票價 price,型別為double
	
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
	public Train(int number,String type,String start ,String dest,double price) {
		this.number=number;
		this.type=type;
		this.start=start;
		this.dest=dest;
		this.price=price;
	}

	public void setNumber(int number) {
		this.number=number;
		
	}
	
	public void setType(String type) {
		this.type=type;
	}
	
	public void setStart(String start) {
		this.start=start;
	}
	
	public void setDest(String dest) {
		this.dest=dest;
		
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getType() {
		return type;
	}
	
	public String getStart() {
		return start;
		
	}
	
	public String getDest() {
		return dest;
	}
	
	public double getPrice() {
		return price;
	}
	

	public  String getEverything() {
		return getNumber()+"-"+getType()+"-"+getStart()+"-"+ getDest()+"-"+getPrice();

		
	}
	
	public static void main(String[] args) {
//		設計對應的getter/setter方法,並在main方法裡透過建構子產生以下7個Train的物件,放到每小題
//		需使用的集合裡
	}
	


	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}
//
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}
	
	
	public int compareTo(Train aTrain) {
//		請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出
		if (this.number > aTrain.number) {
			return 1*-1;
			
		}else if(this.number==aTrain.number){
			return 0;
		} else {
			return -1*-1;
		}
	}
	
	
	
}
