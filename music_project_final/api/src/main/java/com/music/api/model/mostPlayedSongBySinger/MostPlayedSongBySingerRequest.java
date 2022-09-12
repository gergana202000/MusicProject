package com.music.api.model.mostPlayedSongBySinger;

import lombok.*;

@Getter
@Setter(AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class MostPlayedSongBySingerRequest {
    private String singerName;
}
