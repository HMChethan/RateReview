package com.rate.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ClientEntity {
	
	@Id
	private int clientId;
	private String clientName;
	private double version;
	private String clientSecreteKey;
	private String clientAuthKey;
	public ClientEntity(int client_id, String client_name, double version, String client_secrete_key,
			String client_auth_key) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
		this.version = version;
		this.clientSecreteKey = clientSecreteKey;
		this.clientAuthKey = clientAuthKey;
	}
	
	public ClientEntity() {
		super();
	}

	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public double getVersion() {
		return version;
	}
	public void setVersion(double version) {
		this.version = version;
	}
	public String getClientSecreteKey() {
		return clientSecreteKey;
	}
	public void setClientSecreteKey(String clientSecreteKey) {
		this.clientSecreteKey = clientSecreteKey;
	}
	public String getClientAuthKey() {
		return clientAuthKey;
	}
	public void setClientAuthKey(String clientAuthKey) {
		this.clientAuthKey = clientAuthKey;
	}
	
}