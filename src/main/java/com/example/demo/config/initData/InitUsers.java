package com.example.demo.config.initData;

import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.util.RoleEnum;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Order(2)
public class InitUsers implements ApplicationRunner {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public InitUsers(UserRepository userRepository, RoleRepository roleRepository){
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Init Users .....");

        Role roleUser = roleRepository.findByName(RoleEnum.ROLE_USER.getName());
        Role roleAdmin = roleRepository.findByName(RoleEnum.ROLE_USER.getName());

        User user = new User("user", "user", true);
        user.setRoles(Arrays.asList(roleUser));

        userRepository.save(user);

        User admin = new User("admin", "admin", true);
        admin.setRoles(Arrays.asList(roleUser, roleAdmin));

        userRepository.save(admin);

        System.out.println("end.");
    }
}
