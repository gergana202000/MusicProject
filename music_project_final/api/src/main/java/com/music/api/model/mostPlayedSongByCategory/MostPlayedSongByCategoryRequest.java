package com.music.api.model.mostPlayedSongByCategory;

import com.music.api.base.OperationInput;
import lombok.*;

@Getter
@Setter(AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class MostPlayedSongByCategoryRequest implements OperationInput {
    private String category;
}
