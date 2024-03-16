package tn.esprit.devops_project.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.devops_project.entities.ActivitySector;
import tn.esprit.devops_project.repositories.ActivitySectorRepository;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ActivitySectorImplTest {
@Autowired
private ActivitySectorImpl service;
@Autowired
private ActivitySectorRepository repository;
    @Test
    void retrieveAllActivitySectors() {
        ActivitySector ActivitySector =new ActivitySector();
        ActivitySector a=service.addActivitySector(ActivitySector);
     assertNotNull(a);
    }


}