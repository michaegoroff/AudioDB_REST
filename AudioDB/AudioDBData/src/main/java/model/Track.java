package model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "track")
public class Track {
    @Id
    private Long id;
    //@Column
    //private Long albumId;
    @Column
    private String trackName;
    @Column
    private String albumName;
    @Column
    private String artistName;
    @Column
    private Integer duration;
    @Column
    private String genre;
    @Column
    private String descriptionEng;
    @Column
    private Integer trackNumber;
    @Column
    private Long totalPlays;
    @ManyToOne
    @JoinColumn(name = "albumId",referencedColumnName = "id")
    private Album album = new Album();
    @OneToMany(mappedBy = "track")
    private List<Clip> clips = new ArrayList<>();

    public Long getAlbumId(){
        return album.getId();
    }
    public void setAlbumId(Long id){
        album.setId(id);
    }
}
