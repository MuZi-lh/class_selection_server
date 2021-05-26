package fun.muzi.class_selection.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Curriculum {
    private String cour_id;
    private String cour_name;
    private String type;
    private String exam_type;
    private String depa_name;
    private String credit;
    private String requirement;
    private JSONObject prerequisite;
    private String curr_id;
    private Integer year;
    private String semester;
    private Integer start_week;
    private Integer end_week;
    private String lect_id;
    private String lect_name;
    private String room_id;
    private String campus;
    private String building;
    private String door;
    private String slot_id;
    private String day;
    private String start_class;
    private String end_class;
}
