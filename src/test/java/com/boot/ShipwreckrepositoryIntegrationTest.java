package com.boot;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.boot.model.Shipwreck;
import com.boot.repository.ShipwrechRepository;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class ShipwreckrepositoryIntegrationTest {

	@Autowired
	private ShipwrechRepository shipwrackRepository;
	
	@Test
	public void testFindAll(){
		List<Shipwreck> wracks = shipwrackRepository.findAll();
		assertThat(wracks.size(), is(greaterThanOrEqualTo(0)));
	}
}
