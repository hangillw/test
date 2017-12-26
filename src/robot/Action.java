package robot;

public class Action extends Robot {

	
	public Action(Robot r) {
		r.actionBasic();
		r.actionFly();
		r.actioFire();
		r.actionKnife();
	}

	@Override
	public void shape() {
		System.out.println("기본적으로 팔, 다리, 머리, 몸통으로 이루어져 있습니다."); 
	}

}
