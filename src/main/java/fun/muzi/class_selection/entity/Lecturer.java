package fun.muzi.class_selection.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Lecturer {
    private String lect_id;
    private String depa_name;
    private String lect_name;
    private String passwd;
}
