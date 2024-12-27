package com.Ankit.KAM.repository;

import com.Ankit.KAM.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {}

