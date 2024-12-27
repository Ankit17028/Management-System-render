// CallPlanRepository.java
package com.Ankit.KAM.repository;

import com.Ankit.KAM.model.CallPlan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CallPlanRepository extends JpaRepository<CallPlan, Long> {
}
