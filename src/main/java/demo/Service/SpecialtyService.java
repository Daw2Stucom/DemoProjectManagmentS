package demo.Service;

import demo.Model.Specialty;
import demo.Repository.SpecialtyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
//Gestion de transacciones de BBDD.

public class SpecialtyService {
    @Autowired
    private SpecialtyRepository specialtyRepository;

    public void testSpecialty(){
        Specialty specialty = new Specialty();
        specialty.setName("Spring");

        specialtyRepository.save(specialty);
    }
}
