package com.boot;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.boot.controller.ShipwreckController;
import com.boot.model.Shipwreck;
import com.boot.repository.ShipwrechRepository;

public class ShipwreckControllerTest {
	
	@InjectMocks
	private ShipwreckController sc;
	
	@Mock
	private ShipwrechRepository  shipwrechRepository;
	
	@Before
	public void init(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testShipwreckGet(){
		Shipwreck sw  = new Shipwreck();
		sw.setId(1L);
		when(shipwrechRepository.findOne(1L)).thenReturn(sw);
		
		Shipwreck wreck = sc.get(1L);
		
		verify(shipwrechRepository).findOne(1l);
		verify(shipwrechRepository).findOne(1l);
		
		//Junit Matchers
		assertEquals(1l,  wreck.getId().longValue());;
		
		//Hamcrest Matchers
		assertThat(wreck.getId(), is(1l));
	}
}
