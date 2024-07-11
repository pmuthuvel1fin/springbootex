
package com.example.demo.controller;


public class ApiResponse {
	
    private String name;
    private String description;
    private String time;
    private String ipAddress;
	private String hostname;

    public ApiResponse(String name, String description, String time,String ipAddress,String hostname) {
        this.name = name;
        this.description = description;
        this.time = time;
        this.ipAddress = ipAddress ;
        this.hostname = hostname ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}


}