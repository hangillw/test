package robot;

class SingleTon{
	String str;
	
	private static SingleTon inst;
	private SingleTon(){
	}
	public static SingleTon getInstance(){
		if(inst == null) inst = new SingleTon();
		return inst;
	}
}

public class SingleTonEx {
	public static void main(String[] args) {
		SingleTon st1 = SingleTon.getInstance();
		SingleTon st2 = SingleTon.getInstance();
		
		st1.str = "넌 누구";
		System.out.println(st2.str);
		if(st1 == st2) System.out.println("같다");
		else System.out.println("다르다");
		st2.str = "나야 나";
		System.out.println(st1.str);
		if(st1 == st2) System.out.println("같다");
		else System.out.println("다르다");
	}
}
