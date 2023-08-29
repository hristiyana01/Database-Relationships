package onetoone;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
public class PlayerProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String twitter;
    public PlayerProfile(int id, String twitter) {
        this.Id = id;
        this.twitter = twitter;
    }
    public PlayerProfile(String twitter) {
        super();
        this.twitter = twitter;
    }
    public PlayerProfile() {

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    @Override
    public String toString() {
        return "PlayerProfile{" +
                "Id=" + Id +
                ", twitter='" + twitter + '\'' +
                '}';
    }
}
