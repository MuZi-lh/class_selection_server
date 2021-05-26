package fun.muzi.class_selection.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Course {
    private String cour_id;
    private String cour_name;
    private String type;
    private String exam_type;
    private String depa_name;
    private String credit;
    private String requirement;
    private JSONObject prerequisite;
}
