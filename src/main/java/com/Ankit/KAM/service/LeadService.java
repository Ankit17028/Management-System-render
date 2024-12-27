package com.Ankit.KAM.service;

import com.Ankit.KAM.model.Lead;
import com.Ankit.KAM.repository.LeadRepository;
import com.Ankit.KAM.repository.ContactRepository;
import com.Ankit.KAM.repository.InteractionRepository;
import com.Ankit.KAM.repository.CallPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class LeadService {

    @Autowired
    private LeadRepository leadRepository;

    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    private InteractionRepository interactionRepository;

    @Autowired
    private CallPlanRepository callPlanRepository;

    public Lead addLead(Lead lead) {
        lead.setCreatedAt(LocalDateTime.now());
        lead.setUpdatedAt(LocalDateTime.now());
        return leadRepository.save(lead);
    }

    public Lead saveLead(Lead lead) {
        lead.setCreatedAt(LocalDateTime.now());
        lead.setUpdatedAt(LocalDateTime.now());
        return leadRepository.save(lead);
    }


//    public Lead saveLead(Lead lead) {
//        // Save the lead to generate its ID
//        Lead savedLead = leadRepository.save(lead);
//
//        // Update related entities with the lead reference and save them explicitly
//        if (savedLead.getContacts() != null) {
//            savedLead.getContacts().forEach(contact -> {
//                contact.setLead(savedLead);
//                contactRepository.save(contact); // Save contact entity
//            });
//        }
//
//        if (savedLead.getInteractions() != null) {
//            savedLead.getInteractions().forEach(interaction -> {
//                interaction.setLead(savedLead);
//                interactionRepository.save(interaction); // Save interaction entity
//            });
//        }
//
//        if (savedLead.getCallPlan() != null) {
//            savedLead.getCallPlan().setLead(savedLead);
//            callPlanRepository.save(savedLead.getCallPlan()); // Save callPlan entity
//        }
//
//        // Return the saved lead along with its related entities
//        return savedLead;
//    }

    public List<Lead> getAllLeads() {
        return leadRepository.findAll();
    }

    public Lead getLeadById(Long id) {
        return leadRepository.findById(id).orElseThrow(() -> new RuntimeException("Lead not found"));
    }

    public void deleteLead(Long id) {
        leadRepository.deleteById(id);
    }
}
