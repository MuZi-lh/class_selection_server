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
public class Student {
    private String stud_id;
    private String stud_name;
    private Integer gender;
    private String depa_name;
    private String major;
    private Integer total_credit;
    private String passwd;
}
