package com.music.api.model.song;

import com.music.api.base.OperationOutput;
import lombok.*;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@EqualsAndHashCode
public class SongResponse implements OperationOutput {
    private String songName;
    private String singer;
    private Double duration;
    private Integer numberOfLikes;
    private Integer numberOfDownloads;
    private Integer numberOfListens;
    private String category;
}
