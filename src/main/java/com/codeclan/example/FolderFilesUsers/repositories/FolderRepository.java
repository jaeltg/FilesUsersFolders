package com.codeclan.example.FolderFilesUsers.repositories;

import com.codeclan.example.FolderFilesUsers.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
