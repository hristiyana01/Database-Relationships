package onetoone;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
    @JsonManagedReference
    private PlayerProfile playerProfile;
    public Player() {

    }
    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player [id=" + id + ", name=" + name + ", playerProfile=" + playerProfile + "]";
    }
    public PlayerProfile getPlayerProfile() {
        return playerProfile;
    }

    public void setPlayerProfile(PlayerProfile playerProfile) {
        this.playerProfile = playerProfile;
    }
}
