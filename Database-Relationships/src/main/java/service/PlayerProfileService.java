package service;

import onetoone.Player;
import onetoone.PlayerProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PlayerProfileRepository;

import java.util.List;

@Service
public class PlayerProfileService {
    @Autowired
    PlayerProfileRepository playerProfileRepository;

    public List<PlayerProfile> allPlayerProfiles() {
        return playerProfileRepository.findAll();
    }
    public PlayerProfile getPlayerProfile(int profileId) {
        return playerProfileRepository.findById(profileId).get();
    }
    public PlayerProfile addPlayerProfile(PlayerProfile profile) {
        profile.setId(0);
        return playerProfileRepository.save(profile);
    }
    public void deletePlayerProfile(int id) {
        playerProfileRepository.deleteById(id);
    }
}
