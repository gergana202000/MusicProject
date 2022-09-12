package com.music.api.model.mostPlayedSingerForContinent;

import lombok.*;

@Getter
@Setter(AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class MostPlayedSingerForContinentRequest {
    private String continent;
}
