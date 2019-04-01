package org.deokki.book.chap03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * MemberRegisterService를 테스트한다.<br>
 * Spring ApplicationContext로 빈을 생성한다.
 * 
 * @author Deokki
 */
public class MemberMainUsingSpring {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"chap03.xml");
		MemberRegisterService regService = ctx.getBean("memberRegisterService",
				MemberRegisterService.class);

		// registerRequest 초기화
		RegisterRequest req = new RegisterRequest();
		req.setEmail("deokki20@naver.com");
		req.setPassword("xxxxx");
		req.setName("Deokki");
		
		// 회원 등록
		regService.regist(req);
	}
}