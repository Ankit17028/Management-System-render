package com.Ankit.KAM.controller;


import com.Ankit.KAM.model.Lead;
import com.Ankit.KAM.service.LeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leads")
public class LeadController {

    @Autowired
    private LeadService leadService;

    @PostMapping
    public ResponseEntity<Lead> addLead(@RequestBody Lead lead) {
        return new ResponseEntity<>(leadService.addLead(lead), HttpStatus.CREATED);
    }

//    @PostMapping("/leads")
//    public ResponseEntity<Lead> createLead(@RequestBody Lead lead) {
//        Lead savedLead = leadService.saveLead(lead);
//        return ResponseEntity.ok(savedLead);
//    }


    @GetMapping
    public List<Lead> getAllLeads() {
        return leadService.getAllLeads();
    }

    @GetMapping("/{id}")
    public Lead getLeadById(@PathVariable Long id) {
        return leadService.getLeadById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteLead(@PathVariable Long id) {
        leadService.deleteLead(id);
        return new ResponseEntity<>("Lead deleted successfully", HttpStatus.OK);
    }
}
