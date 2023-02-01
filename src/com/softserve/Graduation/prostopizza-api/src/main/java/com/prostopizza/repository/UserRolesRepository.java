package com.prostopizza.repository;

import com.prostopizza.model.Products;
import com.prostopizza.model.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRolesRepository extends JpaRepository<UserRoles, Long> {
    @Query("Select ur.roles_id FROM user_roles ur WHERE ur.user_id=:user_id")
    Long findRoleNameByUserId(@Param("user_id")Long user_id);
}
