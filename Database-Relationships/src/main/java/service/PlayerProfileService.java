package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PlayerProfileRepository;

@Service
public class PlayerProfileService {
    @Autowired
    PlayerProfileRepository playerProfileRepository;


}