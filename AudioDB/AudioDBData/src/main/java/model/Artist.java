package model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "artist")
public class Artist {
    @Id
    private Long id;
    @Column
    private String artistName;
    @Column
    private String labelName;
    @Column
    private Integer formedYear;
    @Column
    private Integer birthYear;
    @Column
    private Integer deathYear;
    @Column
    private String disbanded;
    @Column
    private String artistGenre;
    @Column
    private String artistWebsite;
    @Column
    private String artistFacebook;
    @Column
    private String artistBioEng;
    @Column
    private String gender;
    @Column
    private String artistCountry;
    @Column
    private String artistLogoUrl;
    @Column
    private Integer totalMembers;
    @OneToMany(mappedBy = "artist")
    private List<Album> albums = new ArrayList<>();
}
