package robot;

import robot_actions.FireOk;
import robot_actions.FlyOk;
import robot_actions.KnifeOk;

public class SuperRobot extends Robot {

	public SuperRobot() {
		flyAction = new FlyOk();
		fireAction = new FireOk();
		knifeAction = new KnifeOk();
	}
	@Override
	public void shape() {
		System.out.println("기본적으로 팔, 다리, 머리, 몸통으로 이루어져 있습니다. 그리고 걷고, 달릴 수 있습니다.");
	}

	
	
}
