package fun.muzi.class_selection.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Department {
    private String depa_name;
    private String building;
    private Integer budget;
}
