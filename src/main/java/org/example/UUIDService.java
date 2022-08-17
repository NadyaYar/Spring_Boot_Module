package org.example;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UUIDService {
    public UUID getUUIDs() {
        return UUID.randomUUID();
    }
}
