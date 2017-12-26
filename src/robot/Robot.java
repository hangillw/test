package robot;

import robot_actions.FireAction;
import robot_actions.FlyAction;
import robot_actions.KnifeAction;

// 공통적으로 써야할 기능이 있을때 추상메소드를 사용함;
public abstract class Robot {
	public FlyAction flyAction;
	public FireAction fireAction;
	public KnifeAction knifeAction;
	
	public Robot(){
		
	}
	public abstract void shape();
	
	public void actionFly(){
		flyAction.fly();
	}
	public void actioFire(){
		fireAction.fire();
	}
	public void actionKnife(){
		knifeAction.knife();
	}
	public void actionBasic(){
		System.out.println("팔, 다리, 머리, 몸통이 있습니다");
	}
	public void setFlyAction(FlyAction flyAction) {
		this.flyAction = flyAction;
	}
	public void setFireAction(FireAction fireAction) {
		this.fireAction = fireAction;
	}
	public void setKnifeAction(KnifeAction knifeAction) {
		this.knifeAction = knifeAction;
	}
	
}
