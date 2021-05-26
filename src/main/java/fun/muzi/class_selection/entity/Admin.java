package fun.muzi.class_selection.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Admin {
    private String admi_id;
    private String admi_name;
    private String permission;
    private String passwd;
}
