package com.closetCS.service;

import java.util.List;
import java.util.Map;

import com.closetCS.wrapper.UserWrapper;
import org.springframework.http.ResponseEntity;

public interface UserService {
    
    ResponseEntity<String> singnUp(Map<String,String> requestMap);
    ResponseEntity<String> login(Map<String,String> requestMap);

    ResponseEntity<List<UserWrapper>> getAllUser();
}
