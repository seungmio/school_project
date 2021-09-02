package movable;

class Car implements Movable {
	public void speedUp(int amount) {	// 속도높임 메소드 구현
		System.out.println("속도를 "+amount+" km/h로 높입니다.");
	}
	public void speedDown(int amount) {	// 속도늦춤 메소드 구현
		System.out.println("속도를 "+amount+" km/h로 늦춥니다.");
	}
	String TurnLeft() {
		return "좌회전";
	}
	String TurnRight() {
		return "우회전";
	}
}
