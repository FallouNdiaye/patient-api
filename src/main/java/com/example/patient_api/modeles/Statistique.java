package com.example.patient_api.modeles;

public class Statistique {
	
	    private int totalPatients;
	    private int totalContacts;

	    // Constructor
	    public Statistique(int totalPatients, int totalContacts) {
	        this.totalPatients = totalPatients;
	        this.totalContacts = totalContacts;
	    }

	    // Getters and setters
	    public int getTotalPatients() {
	        return totalPatients;
	    }

	    public void setTotalPatients(int totalPatients) {
	        this.totalPatients = totalPatients;
	    }

	    public int getTotalContacts() {
	        return totalContacts;
	    }

	    public void setTotalContacts(int totalContacts) {
	        this.totalContacts = totalContacts;
	    }
	

}
