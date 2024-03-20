package com.cognizant;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.client.RestTemplate;

import com.cognizant.controllers.RideController;
import com.cognizant.entities.IncidentTypes;
import com.cognizant.models.IncidentTypeDTO;
import com.cognizant.services.IncidentManagementServices;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.mockito.Mockito.*;
@AutoConfigureMockMvc
@WebMvcTest
@ContextConfiguration(classes = RideSharingPlatformApplication.class)
class TestController {

	private MockMvc mockMvc;
	@Mock
	private IncidentManagementServices incidentManagementServices;
	@InjectMocks
	private RideController rideController;
	@Mock
	private RestTemplate restTemplate;
	@Autowired
	private LocalValidatorFactoryBean validator;
	private MockRestServiceServer mockServer;
	private RestTemplate template;
	private ObjectMapper mapper=new ObjectMapper();
	
	@BeforeEach
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		mockMvc=MockMvcBuilders.standaloneSetup(rideController).build();
		template=new RestTemplate();
		mockServer=MockRestServiceServer.createServer(template);
	}
	
	@Test
	public void handleGetAllIncidentTypes_positiveReturnValue() {
		try {
		List<IncidentTypeDTO> mockListOfIncidentTypes=new ArrayList<>();
		IncidentTypeDTO dto=new IncidentTypeDTO();
		dto.setId(1);
		dto.setType(1);
		dto.setExpectedSLAInDay(3);
		mockListOfIncidentTypes.add(dto);
		when(incidentManagementServices.getAllIncidentTypes()).thenReturn(mockListOfIncidentTypes);
		
		ResponseEntity<?> responseEntity=employeeController.handleGetAllEmployees();
		List<EmployeeResponse> actual=(List<EmployeeResponse>)responseEntity.getBody();
		assertTrue(actual.size()>0);
		}catch(Exception e) {
			assertTrue(false);
		}
	}
	

}
