package dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ArtistDto {
    @JsonProperty("idArtist")
    private Long id;
    @JsonProperty("strArtist")
    private String artistName;
    @JsonProperty("strLabel")
    private String labelName;
    @JsonProperty("intFormedYear")
    private Integer formedYear;
    @JsonProperty("intBornYear")
    private Integer birthYear;
    @JsonProperty("intDiedYear")
    private Integer deathYear;
    @JsonProperty("strDisbanded")
    private String disbanded;
    @JsonProperty("strGenre")
    private String artistGenre;
    @JsonProperty("strWebsite")
    private String artistWebsite;
    @JsonProperty("strTwitter")
    private String artistFacebook;
    @JsonProperty("strBiographyEN")
    private String artistBioEng;
    @JsonProperty("strGender")
    private String gender;
    @JsonProperty("strCountry")
    private String artistCountry;
    @JsonProperty("strArtistLogo")
    private String artistLogoUrl;
    @JsonProperty("intMembers")
    private Integer totalMembers;
}
