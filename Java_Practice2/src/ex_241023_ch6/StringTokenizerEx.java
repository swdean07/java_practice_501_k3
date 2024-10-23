package ex_241023_ch6;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		String query = "name=kitae&addr=seoul&age=21";
		StringTokenizer st = new StringTokenizer(query, "&");

		int n = st.countTokens(); // 분리된 토큰 개수
		System.out.println("토큰 개수 = " + n);

		while (st.hasMoreTokens()) {
			String token = st.nextToken(); // 토큰 얻기
			System.out.println(token); // 토큰 출력
		}
	}
}
