package onetomany.uni;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String location;
    @OneToMany(cascade = CascadeType.REMOVE, orphanRemoval=true)
    @JoinColumn(name = "tournament_id")
    private List<Registration> registrations = new ArrayList<>();

    public Tournament() {

    }
    public Tournament(String name, String location) {
        super();
        this.name = name;
        this.location = location;
    }

    public Tournament(int id, String name, String location, List<Registration> registrations) {
        super();
        this.name = name;
        this.location = location;
        this.registrations = registrations;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public List<Registration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(List<Registration> registrations) {
        this.registrations = registrations;
    }
    public void addRegistration(Registration registration) {
        registrations.add(registration);
    }
    //set up one to many relationship


    //remove registration
    public void removeRegistration(Registration reg) {
        if (registrations != null)
            registrations.remove(reg);
    }
    @Override
    public String toString() {
        return "Tournament{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' + ", registrations='" + registrations + '\'' +
                '}';
    }


}