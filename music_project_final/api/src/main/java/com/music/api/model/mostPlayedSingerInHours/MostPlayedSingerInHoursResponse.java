package com.music.api.model.mostPlayedSingerInHours;

import lombok.*;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@EqualsAndHashCode
public class MostPlayedSingerInHoursResponse {
    private Double hoursOfListens;
}
