package com.music.api.model.mostPlayedSingerForContinent;

import lombok.*;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@EqualsAndHashCode
public class MostPlayedSingerForContinentResponse {
    private String singerName;
}
