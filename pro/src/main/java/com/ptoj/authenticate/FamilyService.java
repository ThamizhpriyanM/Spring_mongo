package com.ptoj.authenticate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class FamilyService {

    @Autowired
    private FamilyRepository familyRepository;

    public List<Family> getAllFamilies() {
        return familyRepository.findAll();
    }

    public Family getFamilyById(String id) {
        Optional<Family> optionalFamily = familyRepository.findById(id);
        return optionalFamily.orElse(null);
    }
}
