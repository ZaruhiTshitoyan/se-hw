package com.zara.user.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return args -> {
            User user1 = new User(
                    1L,
                    "User1",
                    LocalDate.of(1999, Month.JANUARY, 5),
                    "test@gmail.example"
            );
            userRepository.saveAll(List.of(user1));
        };
    }
}
