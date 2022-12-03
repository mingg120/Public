package com.springdream.app.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class ReplyVO {
    private Long replyNumber;
    private String replyTitle;
    private String replyContent;
    private int replyAdopt;
    private int replyReport;
    private int replyDate;
    private int replyUpdateDate;
    private Long memberNumber;
    private Long boardNumber;
}
