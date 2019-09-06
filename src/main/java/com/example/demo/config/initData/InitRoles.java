package com.example.demo.config.initData;

import com.example.demo.entity.Role;
import com.example.demo.repository.RoleRepository;
import com.example.demo.util.RoleEnum;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class InitRoles implements ApplicationRunner {
    private final RoleRepository roleRepository;

    public InitRoles(RoleRepository roleRepository){
        this.roleRepository = roleRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Init roles .....");

        Role roleUser = roleRepository.findByName(RoleEnum.ROLE_USER.getName());
        if(roleUser == null){
            roleUser = new Role(RoleEnum.ROLE_USER);
            roleRepository.save(roleUser);
        }

        Role roleAdmin = roleRepository.findByName(RoleEnum.ROLE_USER.getName());
        if(roleAdmin == null){
            roleAdmin = new Role(RoleEnum.ROLE_ADMIN);
            roleRepository.save(roleAdmin);
        }
    }
}
