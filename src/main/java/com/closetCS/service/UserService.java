package com.closetCS.service;

import java.util.Map;

import org.springframework.http.ResponseEntity;

public interface UserService {
    
    ResponseEntity<String> singnUp(Map<String,String> requestMap);
    ResponseEntity<String> login(Map<String,String> requestMap);
}
