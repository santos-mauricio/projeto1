package com.mauricio.projeto1.config;

import com.mauricio.projeto1.entity.User;
import com.mauricio.projeto1.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DataInitilizr implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        userRepository.save( new User(1L, "Mauricio Angelo", "mauricio@test.com.br"));
        userRepository.save( new User(2L, "José Carlos", "jose@test.com.br"));
        userRepository.save( new User(3L, "Antonio dos Santos", "antonio@test.com.br"));
        userRepository.save( new User(4L, "Cristano Almeida", "cristiano@test.com.br"));
        userRepository.save( new User(5L, "Fabiano da Silva", "fabiano@test.com.br"));

    }
}
