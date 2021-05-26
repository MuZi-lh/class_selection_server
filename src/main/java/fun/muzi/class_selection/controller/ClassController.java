package fun.muzi.class_selection.controller;

import fun.muzi.class_selection.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/class")
public class ClassController {

    @Autowired
    ClassService classService;

    @RequestMapping("/search")
    Object search(@RequestBody Map<String, String> body){
        return classService.search(body);
    }
}
