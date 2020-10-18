package main.service.repository;


import main.service.model.Locker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LockerRepository extends JpaRepository<Locker, UUID> {
}

