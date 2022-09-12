package com.music.api.model.mostPlayedSingerInHours;

import lombok.*;

@Getter
@Setter(AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class MostPlayedSingerInHoursRequest {
    private String singerName;
}
