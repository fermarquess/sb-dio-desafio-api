package desafio.dio.sb.domain.model;

import jakarta.persistence.*;

import java.util.List;

import static jakarta.persistence.FetchType.EAGER;


@Entity(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToMany(cascade = CascadeType.ALL, fetch = EAGER)
    private List<MustWatch> mustWatch;

    @OneToMany(cascade = CascadeType.ALL, fetch = EAGER)
    private List<Favorites> favorites;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<MustWatch> getMustWatch() {
        return mustWatch;
    }

    public void setMustWatch(List<MustWatch> mustWatch) {
        this.mustWatch = mustWatch;
    }

    public List<Favorites> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<Favorites> favorites) {
        this.favorites = favorites;
    }
}
