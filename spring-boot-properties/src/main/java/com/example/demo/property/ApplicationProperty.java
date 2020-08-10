package com.example.demo.property;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Graciano
 * @date 2020/8/10 22:13
 */
@Data
@Component
public class ApplicationProperty {

    @Value("${application.name}")
    private String name;

    @Value("${application.version}")
    private String version;





}

