package onetomany.uni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tournaments")
public class TournamentController {

    @Autowired
    RegistrationService registrationService;
    @Autowired
    TournamentService tournamentService;
    @PutMapping("/{id}/registrations/{registration_id}")
    public Tournament addRegistration(@PathVariable int id, @PathVariable int registration_id) {
        Registration registration = registrationService.getRegistration(registration_id);
        System.out.println(registration);
        return registrationService.addRegistration(id, registration_id);
    }
    @GetMapping
    public List<Tournament> allTournaments() {
        return tournamentService.allTournaments();
    }
    @GetMapping("/{id}")
    public Tournament getTournament(@PathVariable int id){
        return tournamentService.getTournament(id);
    }

    @PostMapping
    public Tournament addTournament(@RequestBody Tournament tournament) {
        return tournamentService.addTournament(tournament);
    }

    @PutMapping("/{id}/registrations/{registration_id}")
    public Tournament addRegistration(@PathVariable int id, @PathVariable int registration_id) {
        Registration registration = registrationService.getRegistration(registration_id);
        System.out.println(registration);
        return registrationService.addRegistration(registration_id);
    }

    @PutMapping("/{id}/remove_registrations/{registration_id}")
    public Tournament removeRegistration(@PathVariable int id, @PathVariable int registration_id) {
        Registration registration = registrationService.getRegistration(registration_id);
        System.out.println(registration);
        return registrationService.removeRegistration( registration);
    }

    @DeleteMapping("/{id}")
    public void deleteTournament(@PathVariable int id) {
        tournamentService.deleteTournament(id);
    }


}
