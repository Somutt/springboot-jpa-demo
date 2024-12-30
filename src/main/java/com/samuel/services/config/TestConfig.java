package com.samuel.services.config;

import com.samuel.services.entities.User;
import com.samuel.services.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "Maria Brown", "maria@gmail.com", "999999999", "123456");
        User user2 = new User(null, "Alex Green", "alex@gmail.com", "998895676", "123456");

        userRepository.saveAll(Arrays.asList(user1, user2));
    }
}
