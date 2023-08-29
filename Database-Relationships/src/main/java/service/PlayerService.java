package service;

import onetoone.Player;
import onetoone.PlayerProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PlayerRepository;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    public List<Player> allPlayers() {
       return playerRepository.findAll();
    }

    public Player addPlayer(Player player) {
        player.setId(0);
        return playerRepository.save(player);
    }

    public Player getPlayer(int playerId) {
        return playerRepository.findById(playerId).get();
    }

    public void deletePlayer(int id) {
        playerRepository.deleteById(id);
    }

    public Player assignProfile(int id, PlayerProfile playerProfile) {
        Player player = playerRepository.findById(id).get();
        player.setPlayerProfile(playerProfile);
        return playerRepository.save(player);
    }
}
