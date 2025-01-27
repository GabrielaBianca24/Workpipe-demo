package it.workpipe.IancuDemo.configuration;

import com.cloudinary.Cloudinary;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;


public class ServerConfig {
    @Bean
    public Cloudinary uploader(@Value("${cloudinary.name}") String name,
                               @Value("${cloudinary.apikey}") String apikey,
                               @Value("${cloudinary.secret}") String secret) {
        Map<String, String> config = new HashMap<>();
        config.put("cloud_name", name);
        config.put("api_key", apikey);
        config.put("api_secret", secret);
        return new Cloudinary(config);
    }
}