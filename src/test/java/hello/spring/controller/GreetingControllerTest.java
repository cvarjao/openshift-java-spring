package hello.spring.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.htmlunit.MockMvcWebClientBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import org.springframework.web.bind.annotation.*;
import hello.spring.config.WebMvcConfig;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {WebMvcConfig.class})
@WebAppConfiguration
public class GreetingControllerTest {
	private MockMvc mockMvc;
	private WebClient webClient;
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		webClient = MockMvcWebClientBuilder.webAppContextSetup(webApplicationContext).build();
	}
	
	@Test
	public void testGreetingController1() throws Exception {
		mockMvc.perform(get(HelloController.PATH_HELLO)).andExpect(status().isOk());
	}
	@Test
	public void testGreetingController2() throws Exception {
		HtmlPage page=webClient.getPage("http://localhost"+HelloController.PATH_HELLO);
		assertEquals("Hello", page.getTitleText());
	}
}
