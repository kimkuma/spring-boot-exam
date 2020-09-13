package com.kuma.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class IndexControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void 메인페이지_로딩() {
        String body = this.testRestTemplate.getForObject("/", String.class);
        assertThat(body).contains("스프링 부트입니다.");
    }

    @Test
    public void 글쓰기페이지_로딩() {
        String body = this.testRestTemplate.getForObject("/posts/save", String.class);
        assertThat(body).contains("게시글 등록");
    }
}