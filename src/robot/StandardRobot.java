package robot;

import robot_actions.FireOk;
import robot_actions.FlyNo;
import robot_actions.KnifeOk;

public class StandardRobot extends Robot {
	
	
	public StandardRobot() {
		flyAction = new FlyNo();
		fireAction = new FireOk();
		knifeAction = new KnifeOk();
	}

	@Override
	public void shape() {
		System.out.println("기본적으로 팔, 다리, 머리, 몸통으로 이루어져 있습니다. 그리고 걸을 수 있습니다.");
	}

}
