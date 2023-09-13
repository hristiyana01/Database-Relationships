package onetomany.uni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationService {
    @Autowired
    RegistrationRepository repository;
    public List<Registration> allRegistrations() {
        return repository.findAll();
    }

    public Registration getRegistration(int id){
        return repository.findById(id).get();
    }

    public Registration addRegistration(Registration registration) {
        registration.setId(0);
        return repository.save(registration);
    }

    public void deleteRegistration(int id) {
        repository.deleteById(id);
    }
}
