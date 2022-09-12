package com.music.api.model.song;

import com.music.api.base.OperationInput;
import lombok.*;

@Getter
@Setter(AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class SongRequest implements OperationInput {
    private Long songId;
}
