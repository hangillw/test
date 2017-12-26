package robot;

public class MainClass extends Robot{
	public static void main(String[] args) {
		System.out.println("SuperRobot이 주문 들어 왔어요. 만들어 주세요.");
		Robot s = new Action(new SuperRobot());
//		Robot superRobot = new SuperRobot();
//		superRobot.shape();
//		superRobot.actionBasic();
//		superRobot.actionFly();
//		superRobot.actioFire();
//		superRobot.actionKnife();
		System.out.println("-------------------------------------------------------");
		System.out.println("StandardRobot이 주문 들어왔어요. 만들어 주세요.");
		Robot t = new Action(new StandardRobot());
//		Robot standardRobot = new StandardRobot();
//		standardRobot.shape();
//		standardRobot.actionBasic();
//		standardRobot.actionFly();
//		standardRobot.actioFire();
//		standardRobot.actionKnife();
		System.out.println("-------------------------------------------------------");
		System.out.println("CheapRobot이 주문 들어 왔어요. 만들어 주세요.");
		Robot c = new Action(new CheapRobot());
//		Robot cheapRobot = new CheapRobot();
//		cheapRobot.shape();
//		cheapRobot.actionBasic();
//		cheapRobot.actionFly();
//		cheapRobot.actioFire();
//		cheapRobot.actionKnife();
		System.out.println("-----------------------------------------------------------");
	}

	@Override
	public void shape() {
		// TODO Auto-generated method stub
		
	}
}
