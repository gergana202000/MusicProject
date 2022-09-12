package com.music.api.model.album;

import com.music.api.base.OperationOutput;
import lombok.*;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@EqualsAndHashCode
public class AlbumResponse implements OperationOutput {
    private String albumName;
    private String singer;
    private Integer numberOfSongs;
    private Double duration;
    private Integer numberOfLikes;
    private Integer numberOfDownloads;
    private Integer numberOfListens;
    private String category;
}
