package main.service.repository;


import main.service.model.Apparatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ApparatusRepository extends JpaRepository<Apparatus, UUID> {
}
