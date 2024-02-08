package com.spring.mvc.studies.putandpatch;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class PutAndPatchController {

    @Autowired
    HeavyResourceRepository heavyResourceRepository;

    @PutMapping("/heavyresource/{id}")
    public ResponseEntity<?> saveResource(@RequestBody HeavyResource heavyResource, @PathVariable("id") Long id){
        heavyResourceRepository.save(heavyResource);
        return ResponseEntity.ok("resource saved");
    }

    @PostMapping("/heavyresource")
    public ResponseEntity<?> createResource(@RequestBody HeavyResource heavyResource){
        heavyResourceRepository.save(heavyResource);
        return ResponseEntity.ok("resource created");
    }


}
