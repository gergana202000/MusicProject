package com.music.api.model.mostDownloadSong;

import com.music.api.base.OperationInput;
import lombok.*;

@Getter
@Setter(AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class MostDownloadSongRequest implements OperationInput {
    //private Integer numberOfDownloads;
}
