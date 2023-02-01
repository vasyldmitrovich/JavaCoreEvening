package com.prostopizza.repository;

import com.prostopizza.model.Products;
import com.prostopizza.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    @Query("Select r.name FROM Role r WHERE r.id=:role_id")
    String findRoleNameById(@Param("role_id")Long role_id);
}
