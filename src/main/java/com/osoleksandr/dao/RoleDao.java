package com.osoleksandr.dao;

import com.osoleksandr.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {

}
