package com.codeclan.example.FolderFilesUsers.repositories;

import com.codeclan.example.FolderFilesUsers.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
