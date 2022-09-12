package com.music.api.model.mostDownloadSong;

import com.music.api.base.OperationOutput;
import lombok.*;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@EqualsAndHashCode
//most downloaded song at all
public class MostDownloadSongResponse implements OperationOutput {
    private String songName;
    private String singerName;
    private Double duration;
    private Integer numberOfDownloads;

}
