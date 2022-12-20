package human28;

public class MyTvExam {

	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.turnOnOff();
		t.turnOnOff();
		System.out.printf("티비가 켜졌는가? %b\n", t.isPowerOn);
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:" +t.channel+", VOL:"+ t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:" +t.channel+", VOL:"+ t.volume);
		
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:" +t.channel+", VOL:"+ t.volume);
		
		t.volume = 50;
		t.channel = 50;
		t.volumeUp();
		t.channelDown();
		System.out.println("CH:" +t.channel+", VOL:"+ t.volume);
	}

}
