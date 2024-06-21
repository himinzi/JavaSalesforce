package ch08.sec04;

public interface RemoteControl {
	//상수 필드 : 자동으로 final static 이 붙음~
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}

