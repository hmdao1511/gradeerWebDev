package com.example.gradeerWeb.gradeerConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradeerConfigService {
    @Autowired
    private GradeerConfigRepository repo;
}
