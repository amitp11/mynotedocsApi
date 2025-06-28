package com.mynotedocsApi.restapi.repository;

import com.mynotedocsApi.restapi.entity.KeyValueEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface KeyValueRepository extends JpaRepository<KeyValueEntry, String> {
    List<KeyValueEntry> findByKeyContainingIgnoreCase(String query);
}
