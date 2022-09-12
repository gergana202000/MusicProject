package com.music.api.model.mostPlayedSongByCategory;

import com.music.api.base.OperationOutput;
import lombok.*;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@EqualsAndHashCode
public class MostPlayedSongByCategoryResponse implements OperationOutput {
    private String songName;
    private String singerName;
    private Integer numberOfLikes;
    //private Integer numberOfListens;
}
