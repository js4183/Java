package 채팅프로그램;

import java.net.Socket;

public class SocketClient {

	public static void main(String[] args) {

		try {
			// 연결한 소켓 생성(서버소켓포트번호, 서버주소-ip)
			Socket socket = new Socket("172.30.1.13", 1234);// 기본적으로 내 pc 접속 "120.0.0.1"
			System.out.println("서버 접속 성공!");

			ListeningThread lt = new ListeningThread(socket);
			WritingThread wt = new WritingThread(socket);
			
			lt.start();
			wt.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
