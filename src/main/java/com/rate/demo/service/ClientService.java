package com.rate.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rate.demo.model.ClientEntity;
import com.rate.demo.repositroy.Clientrepositroy;


@Service
public class ClientService {
	@Autowired
	private Clientrepositroy testrepositroy;

	public List<ClientEntity> getClientData() {
		List<ClientEntity> list = new ArrayList<ClientEntity>();
		ClientEntity c1 = new ClientEntity(1, "flipkart", 1.2, "abc@123", "xyz@123");
		list.add(c1);
		return list;
	}

	public ClientEntity addClientdata(ClientEntity cliententity) {
		ClientEntity c = testrepositroy.save(cliententity);
		return c;
		}
    public boolean verifydetails(Map<String, String> client) {
    	boolean res=false;
		String id = client.get("clientid");
		int i = Integer.parseInt(id) ;
		String s = client.get("clientname");
		String v=client.get("version");
		  double d=Double.parseDouble(v);
		String s1 = client.get("clientsecretekey");
		String s2 = client.get("clientauthkey");
		ClientEntity id1 = testrepositroy.getById(i);
		
		try {
		if (i == id1.getClientId() && s.equals(id1.getClientName()) && d == id1.getVersion()
				&& s2.equals(id1.getClientAuthKey()) && s1.equals(id1.getClientSecreteKey())) {
			res =true;
		   }
		}
		catch(Exception e)
		{
		res=false;
		}
		return res;
	}
   }
