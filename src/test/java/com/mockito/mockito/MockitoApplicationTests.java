package com.mockito.mockito;

import com.mockito.mockito.entity.User;
import com.mockito.mockito.repository.UserRepository;
import com.mockito.mockito.service.UserService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@RequiredArgsConstructor
@ExtendWith(MockitoExtension.class)
class MockitoApplicationTests {

	@MockBean
	private UserRepository userRepository;

	@Autowired
	private UserService userService;
	@Test
	public void addUser(){
		User user = new User(1L,"vinh", 20,"Ha Noi");
		when(userRepository.save(user)).thenReturn(user);
		assertEquals(user, userService.addUser(user));
	}

}
