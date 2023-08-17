package com.vipflonline.course.request.douyin;

import com.vipflonline.course.entity.core.CourseChapterPeriod;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class DouyinCourseAddRequest {
    String courseId;
    private String name;
    private String summary;
    private BigDecimal price;
    private BigDecimal originalPrice;
    private String detail;
    private List<DouyinCourseMediaAddRequest> periods;
}
