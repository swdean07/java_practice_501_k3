package ex_241023_cha13;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
	public static void main(String[] args) {
		
		byte b[] = new byte[6]; // 비어 있는 byte 배열
		try {
			// 출력 대상 파일을 읽어서 -> FileInputStream 담기 
			FileInputStream fin = new FileInputStream("c:\\Temp\\test.out");
			int n = 0, c;
			// FileInputStream - fin 인스턴스에서 한 바이트 씩 읽어서 
			// 바이트 타입으로 형변환 후, -> 임시 배열에 담기. 
			
			while ((c = fin.read()) != -1) {
				b[n] = (byte) c; // 읽은 바이트를 배열에 저장
				n++;
			}

			System.out.println("c:\\Temp\\test.out에서 읽은 배열을 출력합니다.");
			// 임시 배열을 콘솔에 출력하기. 
			for (int i = 0; i < b.length; i++)
				System.out.print(b[i] + " ");
			System.out.println();

			fin.close();
		} catch (IOException e) {
		}
	}
}
