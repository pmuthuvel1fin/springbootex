package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.net.InetAddress;
import java.net.UnknownHostException;


@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/info")
    public ApiResponse getInfo() {
        String name = "TimeServer";
        String description = "SpringBoot TimeServer";
        String currentTime = getCurrentTime();
        
        InetAddress ip;
        String hostname;
        ApiResponse apiResponse = null;
        try {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
            System.out.println("Your current IP address : " + ip);
            System.out.println("Your current Hostname : " + hostname);
            
            apiResponse = new ApiResponse(name, description, currentTime, ip.getHostAddress(),hostname);
            
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        return apiResponse; 
    }

    private String getCurrentTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }

    
}