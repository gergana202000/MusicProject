package com.music.api.model.album;

import com.music.api.base.OperationInput;
import lombok.*;
@Getter
@Setter(AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class AlbumRequest implements OperationInput {
    private Long albumID;
}
