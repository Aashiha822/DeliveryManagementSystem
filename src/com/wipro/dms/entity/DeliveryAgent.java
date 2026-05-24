package com.wipro.dms.entity;

public class DeliveryAgent {
	
	private String agentId;
	private String name;
	private boolean active;

public DeliveryAgent(){
	
}


public DeliveryAgent(String agentId,String name,boolean active) {
	this.agentId=agentId;
	this.name=name;
	this.active=active;
}

}