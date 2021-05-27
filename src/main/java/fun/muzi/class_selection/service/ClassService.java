package fun.muzi.class_selection.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import fun.muzi.class_selection.entity.Curriculum;
import fun.muzi.class_selection.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ClassService {

    @Autowired
    ClassRepository classRepository;

    public Object search(Map<String, String> body) {
        Integer pageNum=Integer.parseInt(body.get("pageNum"));
        Integer pageSize = Integer.parseInt(body.get("pageSize"));
        PageHelper.startPage(pageNum, pageSize);
        Curriculum curriculum = new Curriculum();
        curriculum.setCampus(body.get("campus"));
        curriculum.setDay(body.get("day"));
        curriculum.setDepa_name(body.get("depa_name"));
        curriculum.setCour_name(body.get("cour_name"));
        curriculum.setCour_id(body.get("cour_id"));
        curriculum.setCurr_id(body.get("curr_id"));
        curriculum.setLect_id(body.get("lect_id"));
        curriculum.setLect_name(body.get("lect_name"));
        System.out.println(curriculum);
        if (Boolean.parseBoolean(body.get("redundantOnly"))){
            PageInfo<Curriculum> p = new PageInfo<>(classRepository.redundantSearch(curriculum));
            return p;
        }else{
            PageInfo<Curriculum> p = new PageInfo<>(classRepository.search(curriculum));
            return p;
        }

    }
}
