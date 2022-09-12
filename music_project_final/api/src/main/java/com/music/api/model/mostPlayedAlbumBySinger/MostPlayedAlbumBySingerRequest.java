package com.music.api.model.mostPlayedAlbumBySinger;

import lombok.*;

@Getter
@Setter(AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class MostPlayedAlbumBySingerRequest {
    private String albumName;
}
