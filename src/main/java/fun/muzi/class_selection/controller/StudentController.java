package fun.muzi.class_selection.controller;

import fun.muzi.class_selection.entity.Student;
import fun.muzi.class_selection.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/login")
    public Object login(@RequestBody Map<String, String> body){
        return studentService.check(body.get("stud_id"),body.get("passwd"));
    }

    @RequestMapping("/getById")
    public Object getById(@RequestBody Map<String, String> body){
        return studentService.getById(body.get("stud_id"));
    }

    @RequestMapping("/getClassList")
    public Object getClassList(@RequestBody Map<String, String> body){
        return studentService.getClassList(
                body.get("stud_id"),
                Integer.parseInt(body.get("year")),
                body.get("semester")
        );
    }

    @RequestMapping("/addTake")
    public Object addTake(@RequestBody Map<String, String> body) {
        return studentService.addTake(
                body.get("stud_id"),
                body.get("cour_id"),
                body.get("curr_id"),
                Integer.parseInt(body.get("year")),
                body.get("semester")
        );
    }

    @RequestMapping("/dropTake")
    public Object dropTake(@RequestBody Map<String, String> body) {
        return studentService.dropTake(
                body.get("stud_id"),
                body.get("cour_id"),
                body.get("curr_id"),
                Integer.parseInt(body.get("year")),
                body.get("semester")
        );
    }

    @RequestMapping("/changeInfo")
    public Object changeInfo(@RequestBody Student student){
        return studentService.changeInfo(student);
    }

    @RequestMapping("/changePasswd")
    public Object changePasswd(@RequestBody Map<String, String> body) {
        return studentService.changePasswd(
                body.get("stud_id"),
                body.get("old_passwd"),
                body.get("new_passwd")
        );
    }

    @RequestMapping("/getScore")
    public Object getScore(@RequestBody Map<String, String> body){
        return studentService.getScore(body.get("stud_id"));
    }

}
