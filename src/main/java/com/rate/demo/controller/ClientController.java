package com.rate.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.rate.demo.model.ClientEntity;

import com.rate.demo.service.ClientService;

@RestController
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	@RequestMapping(value="/getClient",method = RequestMethod.GET)
	public ResponseEntity<List<ClientEntity>> getAllClients()  throws JsonMappingException, JsonProcessingException
	{
		List<ClientEntity> c=clientService.getClientData();
		//sysgfhjrukfljhl
		return ResponseEntity.ok(c);
		}
	@RequestMapping(value="/addClient",method = RequestMethod.POST)
	public ResponseEntity<ClientEntity> addClients(@RequestBody ClientEntity client)  throws JsonMappingException, JsonProcessingException
	{
		ClientEntity c=clientService.addClientdata(client);
	return ResponseEntity.ok(c);
		}
	
}
