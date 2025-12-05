package com.example.auth.config;

import com.example.auth.model.Product;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@Component
@ConfigurationProperties (prefix = "app")
public class AppProperties {
    private String name;
    private List<Product> products;
    private JwtProps JWT;
    private LoginProps login;

    @Setter
    @Getter
    public static class LoginProps {
        private String username;
        private String password;
    }

    @Getter
    @Setter
    public static class JwtProps {
        private String secret;
        private long expiration;
    }

}
