package com.music.api.model.singer;

import com.music.api.base.OperationInput;
import lombok.*;

@Getter
@Setter(AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class SingerRequest implements OperationInput {
    private Long singerId;
}
