package com.vipflonline.course.request.douyin;

import lombok.Data;

import java.util.List;

@Data
public class DouyinCourseBatchAddRequest {
    List<String> courseIds;
}
