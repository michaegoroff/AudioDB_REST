package model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "album")
public class Album {
    @Id
    private Long id;
    //@Column
    //private Long artistId;
    @Column
    private String albumName;
    @Column
    private String artistName;
    @Column
    private Integer releaseYear;
    @Column
    private String albumGenre;
    @Column
    private String labelName;
    @Column
    private String thumbUrl;
    @Column
    private String descriptionEng;
    @ManyToOne
    @JoinColumn(name = "artistId",referencedColumnName = "id")
    private Artist artist = new Artist();
    @OneToMany(mappedBy = "album")
    private List<Track> tracks = new ArrayList<>();

    public Long getArtistId(){
        return artist.getId();
    }
    public void setArtistId(Long id){
        artist.setId(id);
    }
}
