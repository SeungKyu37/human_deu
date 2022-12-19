package human01;

public class TvExam {

	public static void main(String[] args) {
//		RemoteControl rc1 = new Television();
		Television tv = new Television();
		RemoteControl rc1 = tv;
		// rc1는 구현객체, Television은 구현 클래스
		rc1.turnOn();
		rc1.setVolume(5);
		rc1.setMute(false);	// 무음해제
		rc1.setVolume(RemoteControl.MIN_VOL);
		// RemoteControl.MIN_VOL ==> 0
		// 그래서 rc1.setVolume(0)과 같은 동작을 함.
		rc1.turnOff();
		RemoteControl.changeBatt();
		
		Audio au = new Audio();
		RemoteControl rc2 = au;
		// rc2는 구현객체, Audio은 구현 클래스
		rc2.turnOn();
		rc2.setVolume(5);
		rc2.setMute(false);	// 무음해제
		rc2.setVolume(RemoteControl.MIN_VOL);
		// RemoteControl.MIN_VOL ==> 0
		// 그래서 rc2.setVolume(0)과 같은 동작을 함.
		rc2.turnOff();
		RemoteControl.changeBatt();
	}
}
