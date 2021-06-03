package fun.muzi.class_selection.controller;

import fun.muzi.class_selection.entity.Lecturer;
import fun.muzi.class_selection.service.LecturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/lect")
public class LecturerController {

    @Autowired
    LecturerService lecturerService;

    @RequestMapping("/login")
    public Object login(@RequestBody Map<String, String> body){
        return lecturerService.check(body.get("lect_id"),body.get("passwd"));
    }

    @RequestMapping("/getById")
    public Object getById(@RequestBody Map<String, String> body){
        return lecturerService.getById(body.get("lect_id"));
    }

    @RequestMapping("/getClassList")
    public Object getClassList(@RequestBody Map<String, String> body){
        return lecturerService.getClassList(
                body.get("lect_id"),
                Integer.parseInt(body.get("year")),
                body.get("semester")
        );
    }

    @RequestMapping("/getStudentList")
    public Object getStudentList(@RequestBody Map<String, String> body){
        return lecturerService.getStudentList(
                body.get("cour_id"),
                body.get("curr_id"),
                Integer.parseInt(body.get("year")),
                body.get("semester")
        );
    }

    @RequestMapping("/setGrade")
    public Object setGrade(@RequestBody Map<String, String> body) {
        return lecturerService.setGrade(
                body.get("cour_id"),
                body.get("curr_id"),
                Integer.parseInt(body.get("year")),
                body.get("semester"),
                body.get("stud_id"),
                Float.parseFloat(body.get("grade"))
        );
    }

    @RequestMapping("/changePasswd")
    public Object changePasswd(@RequestBody Map<String, String> body){
        return lecturerService.changePasswd(
                body.get("lect_id"),
                body.get("old_passwd"),
                body.get("new_passwd")
        );
    }

    @RequestMapping("/changeInfo")
    public Object changeInfo(@RequestBody Lecturer lecturer){
        return lecturerService.changeInfo(lecturer);
    }
}
