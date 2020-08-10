package com.example.demo.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Graciano
 * @date 2020/8/10 22:55
 */
@Data
@Component
@ConfigurationProperties(prefix = "developer")
public class DeveloperProperty {

    private String name;

    private String website;

    private String qq;

    private String phoneNumber;
}
