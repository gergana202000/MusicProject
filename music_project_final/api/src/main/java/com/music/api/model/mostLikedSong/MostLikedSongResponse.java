package com.music.api.model.mostLikedSong;

import com.music.api.base.OperationOutput;
import lombok.*;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@EqualsAndHashCode
//most liked song at all
public class MostLikedSongResponse implements OperationOutput {
    private String songName;
    private String singerName;
    private Double duration;
    private Integer numberOfLikes;
}
