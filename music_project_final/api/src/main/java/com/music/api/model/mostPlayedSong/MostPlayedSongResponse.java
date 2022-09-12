package com.music.api.model.mostPlayedSong;

import lombok.*;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@EqualsAndHashCode
public class MostPlayedSongResponse {
    private String songName;
    private String singerName;
    private Integer numberOfListens;
}
