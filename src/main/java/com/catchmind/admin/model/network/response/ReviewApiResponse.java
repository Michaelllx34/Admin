package com.catchmind.admin.model.network.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReviewApiResponse {
    private Long revIdx;
    private String revNick;
    private String revPhoto;
    private Long revLike;
    private String revContent;
    private Double revScore;
    private String resaBisName;
}
