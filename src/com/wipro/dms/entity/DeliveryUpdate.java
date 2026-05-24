package com.wipro.dms.entity;

public class DeliveryUpdate {
	private String updateId;
    private String deliveryId;
    private String date;
    private String notes;

 
    public DeliveryUpdate() {

    }

  
    public DeliveryUpdate(String updateId, String deliveryId, String date, String notes) {

        this.updateId = updateId;
        this.deliveryId = deliveryId;
        this.date = date;
        this.notes = notes;
    }

   
    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

  
    public String getDeliveryId() {
        return deliveryId;
    }

  
    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

   
    public String getDate() {
        return date;
    }

   
    public void setDate(String date) {
        this.date = date;
    }

  
    public String getNotes() {
        return notes;
    }

    
    public void setNotes(String notes) {
        this.notes = notes;
    }
}
