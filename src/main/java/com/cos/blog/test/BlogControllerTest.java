package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


 //스프링이 com.cos.blog 패키지 이하를 스캔해서 전부 메모리에 new해주는 건 아님
//특정 어노테이션이 붙어있는 클래스 파일들을 new해서 IOC(제어의 역전)해서 스프링 컨테이너로 관리
@RestController
public class BlogControllerTest {

	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}
}
