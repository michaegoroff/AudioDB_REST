package model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "clip")
public class Clip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //@Column
    //private Long trackId;
    @Column
    private String artistName;
    @Column
    private String trackName;
    @Column
    private Integer duration;
    @Column
    private String trackThumbUrl;
    @Column
    private String clipUrl;
    @Column
    private String descriptionEng;
    @ManyToOne
    @JoinColumn(name = "trackId",referencedColumnName = "id")
    private Track track = new Track();

    public Long getTrackId(){
        return track.getId();
    }

    public void setTrackId(Long id){
        track.setId(id);
    }
}
