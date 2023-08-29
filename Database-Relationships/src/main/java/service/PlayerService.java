package service;

import onetoone.Player;
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
}
