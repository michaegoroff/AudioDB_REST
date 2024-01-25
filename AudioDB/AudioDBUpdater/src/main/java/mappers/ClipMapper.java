package mappers;

import dtos.ClipDto;
import model.Clip;

public class ClipMapper implements IMapper<Clip, ClipDto>{
    @Override
    public Clip map(ClipDto clipDto) {
        return map(new Clip(),clipDto);
    }

    @Override
    public Clip map(Clip clip, ClipDto clipDto) {
        clip.setTrackId(clipDto.getTrackId());
        clip.setArtistName(clipDto.getArtistName());
        clip.setTrackName(clipDto.getTrackName());
        clip.setDuration(clipDto.getDuration());
        clip.setTrackThumbUrl(clipDto.getTrackThumbUrl());
        clip.setClipUrl(clipDto.getClipUrl());
        clip.setDescriptionEng(clipDto.getDescriptionEng());
        return clip;
    }
}
