
public class Music {

	// 뮤직플레이어에 대한 설계도를 작성하는 Model 부분
	// Model = Value Object (VO) = DTO Data Transfer Object
	
	private String songName;
	private String singer;
	private int playTime;
	
	// 음악 파일의 경로를 저장할 수 있는 필드
	private String musicPath;
	
	
	public Music(String songname, String singer, int playTime, String musicPath) {
		this.songName= songname;
		this.singer= singer;
		this.playTime= playTime;
		this.musicPath=musicPath;
		
	}
	
	public String getMusicPath() {
		return musicPath;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getPlayTime() {
		return playTime;
	}

	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}
}
