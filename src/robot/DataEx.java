package robot;

class Data {
	int kor;
	int eng;
	int math;
	
	void add (Data d1, Data d2){
		d1.kor = d2.eng;
		System.out.println(d1.kor);
	}
}

public class DataEx{
	public static void main(String[] args){
		Data d1 = new Data();
		Data d2 = new Data();
		Data d3 = new Data();
		
		d1.kor = 50;
		d1.math = 70;
		d2.eng = 80;
		d3.add(d1, d2);
		System.out.println(d1.kor);
	}
}