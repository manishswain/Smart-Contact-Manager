package com.scm.helpers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Message implements java.io.Serializable {

    private String content;

    @Builder.Default
    private MessageType type = MessageType.blue;

}
