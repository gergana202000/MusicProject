package com.music.api.model.mostPlayedSongBySinger;

import lombok.*;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@EqualsAndHashCode
public class MostPlayedSongBySingerResponse {
    private String songName;
    private Integer numberOfListens;
}
