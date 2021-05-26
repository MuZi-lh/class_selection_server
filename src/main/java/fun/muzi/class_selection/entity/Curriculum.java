package fun.muzi.class_selection.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper=true)
public class Curriculum extends Course {
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
}
