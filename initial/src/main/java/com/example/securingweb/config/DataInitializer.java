package com.example.securingweb.config;

import com.example.securingweb.model.Role;
import com.example.securingweb.model.User;
import com.example.securingweb.repository.RoleRepository;
import com.example.securingweb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) {
        // Create roles if they don't exist
        Role userRole = roleRepository.findByName("ROLE_USER");
        if (userRole == null) {
            userRole = new Role();
            userRole.setName("ROLE_USER");
            roleRepository.save(userRole);
        }

        Role adminRole = roleRepository.findByName("ROLE_ADMIN");
        if (adminRole == null) {
            adminRole = new Role();
            adminRole.setName("ROLE_ADMIN");
            roleRepository.save(adminRole);
        }

        // Create default users if they don't exist
        if (userRepository.findByUsername("user") == null) {
            User user = new User();
            user.setUsername("user");
            user.setPassword(passwordEncoder.encode("password"));
            Set<Role> roles = new HashSet<>();
            roles.add(userRole);
            user.setRoles(roles);
            userRepository.save(user);
        }

        if (userRepository.findByUsername("admin") == null) {
            User admin = new User();
            admin.setUsername("admin");
            admin.setPassword(passwordEncoder.encode("admin"));
            Set<Role> roles = new HashSet<>();
            roles.add(userRole);
            roles.add(adminRole);
            admin.setRoles(roles);
            userRepository.save(admin);
        }
    }
}