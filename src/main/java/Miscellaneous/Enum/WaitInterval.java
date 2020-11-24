package Miscellaneous.Enum;

public enum WaitInterval {
	OneMinute(60), TwoMinute(120), OneSecond(1), TenSecond(10), FiftenSecond(15000), FiveMuntes(300);
	
	private final int seconds;
	
	WaitInterval(int seconds){
		this.seconds=seconds;
	}
	
	public int getSeconds(){
		return seconds;
	}

	public int getMilliSeconds(){
		return seconds*1000;
	}
	
	public int getMinuteRounded(){
		return Math.round(seconds/60);
	}
}
