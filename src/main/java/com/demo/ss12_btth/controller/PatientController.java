package com.demo.ss12_btth.controller;

import com.demo.ss12_btth.model.entity.Patient;
import com.demo.ss12_btth.service.PatientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Scanner;
@Controller
@RequestMapping("/patients")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("patients", patientService.getAllPatients());
        return "list";
    }

    @GetMapping("/add")
    public String showForm(Model model) {
        model.addAttribute("patient", new Patient());
        return "add";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("patient") Patient patient,
                       BindingResult result) {
        if (result.hasErrors()) {
            return "add";
        }
        patientService.addPatient(patient);
        return "redirect:/patients";
    }
}
