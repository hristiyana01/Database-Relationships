package controller;

import onetoone.Player;
import onetoone.PlayerProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.PlayerProfileService;
import service.PlayerService;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {
    @Autowired
    PlayerService playerService;
    @Autowired
    PlayerProfileService playerProfileService;

    //GET all players
    @GetMapping("")
    public List<Player> allPlayers() {
        return playerService.allPlayers();
    }
    //GET player by Id
    @GetMapping("/{playerId}")
    public Player getPlayer(@PathVariable int playerId) {
        return playerService.getPlayer(playerId);
    }
    //POST player
    @PostMapping
    public Player addPlayer(@RequestBody Player player) {
        return playerService.addPlayer(player);
    }
    //DELETE player
    @DeleteMapping("/{id}")
    public void deletePlayer(@PathVariable int id) {
         playerService.deletePlayer(id);
    }

    @PutMapping("/{id}/profiles/{profile_id}")
    public Player assignDetail(@PathVariable int id, @PathVariable int profile_id) {
        PlayerProfile playerProfile = playerProfileService.getPlayerProfile(profile_id);
        System.out.println(playerProfile);
        return playerService.assignProfile(id, playerProfile);
    }
}
