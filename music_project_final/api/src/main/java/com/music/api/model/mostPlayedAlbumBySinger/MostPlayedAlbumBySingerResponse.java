package com.music.api.model.mostPlayedAlbumBySinger;

import lombok.*;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@EqualsAndHashCode
public class MostPlayedAlbumBySingerResponse {
    private String singerName;
    private Integer numberOfListens;

}
