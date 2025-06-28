package com.mynotedocsApi.restapi.service;

import com.mynotedocsApi.restapi.entity.KeyValueEntry;
import com.mynotedocsApi.restapi.repository.KeyValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class KeyValueService {

    @Autowired
    private KeyValueRepository repository;

    public KeyValueEntry save(String key, String value) {
        KeyValueEntry entry = new KeyValueEntry();
        entry.setKey(key);
        entry.setValue(value);
        return repository.save(entry);
    }

    public Optional<KeyValueEntry> get(String key) {
        return repository.findById(key);
    }

    public List<KeyValueEntry> search(String query) {
        return repository.findByKeyContainingIgnoreCase(query);
    }
}