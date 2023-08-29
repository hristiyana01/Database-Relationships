package controller;

import onetoone.PlayerProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.PlayerProfileService;
import service.PlayerService;

import java.util.List;

@RestController
@RequestMapping("/profiles")
public class PlayerProfileController {
    @Autowired
    PlayerProfileService playerProfileService;
    //GET all player profiles
    @GetMapping
    public List<PlayerProfile> allPlayerProfiles() {
        return playerProfileService.allPlayerProfiles();
    }
    //GET player profile by Id
    @GetMapping("/{id}")
    public PlayerProfile getPlayerProfile(@PathVariable int id) {
        return playerProfileService.getPlayerProfile(id);
    }
    //POST player profile
    @PostMapping
    public PlayerProfile addPlayerProfile(@RequestBody PlayerProfile playerProfile) {
        return playerProfileService.addPlayerProfile(playerProfile);
    }
    //DELETE player profile
    @DeleteMapping("/{id}")
    public void deletePlayerProfile(@PathVariable int id) {
        playerProfileService.deletePlayerProfile(id);
    }
}
