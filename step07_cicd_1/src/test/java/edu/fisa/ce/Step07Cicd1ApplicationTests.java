package edu.fisa.ce;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
// 또는
import static org.junit.jupiter.api.Assertions.assertEquals; // JUnit 5

@SpringBootTest
class Step07CicdApplicationTests {
	@Test
	public void testAddition() {
		int result = 12 + 3;
		/* 예시 - 서버시작시에 특정 datebase 로부터 검색
		 * 그 데이터는 꼭 fisa여야만 하는상항
		 * fisa가 없다면 서버 중지 또는 다른 로직실행
		 * 
		 * 개발중에 데이터에 대한 test검증용등으로 사용
		 * 
		 */
		System.out.println("****비교 전****");

		assertEquals(15, result); // 성공: 5 == 5
		System.out.println("****비교 후****");
	}
}