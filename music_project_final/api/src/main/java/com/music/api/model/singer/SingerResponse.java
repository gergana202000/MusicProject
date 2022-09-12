package com.music.api.model.singer;

import com.music.api.base.OperationOutput;
import lombok.*;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@EqualsAndHashCode
public class SingerResponse implements OperationOutput {
    private String singerName;
    private String continent;
    private String song;
    private String album;
}
