package com.music.api.model.mostPlayedAlbum;

import lombok.*;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@EqualsAndHashCode
public class MostPlayedAlbumResponse {
    private String albumName;
    private String singerName;
    private Integer numberOfListens;

}
