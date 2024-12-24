package com.example.patient_api.modeles;



public class Contact {
	    
	    private String email;  
	    private String mobile; 
	    private String fixe;   

	    
	    public Contact() {}

	    public Contact(String email, String mobile, String fixe) {
	        this.email = email;
	        this.mobile = mobile;
	        this.fixe = fixe;
	    }

	    
	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getMobile() {
	        return mobile;
	    }

	    public void setMobile(String mobile) {
	        this.mobile = mobile;
	    }

	    public String getFixe() {
	        return fixe;
	    }

	    public void setFixe(String fixe) {
	        this.fixe = fixe;
	    }
}
