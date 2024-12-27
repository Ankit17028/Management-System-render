// InteractionRepository.java
package com.Ankit.KAM.repository;

import com.Ankit.KAM.model.Interaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InteractionRepository extends JpaRepository<Interaction, Long> {
}

