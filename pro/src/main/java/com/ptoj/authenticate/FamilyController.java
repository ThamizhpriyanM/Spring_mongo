package com.ptoj.authenticate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class FamilyController {

    @Autowired
    private FamilyService familyService;

    @GetMapping("/families")
    public String getFamilies(Model model) {
        List<Family> families = familyService.getAllFamilies();
        model.addAttribute("families", families);
        return "families";
    }
    @GetMapping("/families/{familyId}")
    public String getFamilyDetails(@PathVariable String familyId, Model model) {
        Family family = familyService.getFamilyById(familyId);
        model.addAttribute("family", family);
        return "family_details";
    }
}

