package fun.muzi.class_selection.controller;

import fun.muzi.class_selection.entity.Course;
import fun.muzi.class_selection.entity.Curriculum;
import fun.muzi.class_selection.entity.Lecturer;
import fun.muzi.class_selection.entity.Student;
import fun.muzi.class_selection.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    @RequestMapping("/login")
    public Object login(@RequestBody Map<String, String> body){
        return adminService.check(body.get("admi_id"),body.get("passwd"));
    }

    @RequestMapping("/getCourseList")
    public Object getCourseList(@RequestBody Course course) {
        return adminService.getCourseList(course);
    }

    @RequestMapping("/addCourse")
    public Object addCourse(@RequestBody Course course) {
        return adminService.addCourse(course);
    }

    @RequestMapping("/dropCourse")
    public Object dropCourse(@RequestBody Map<String, String> body) {
        return adminService.dropCourse(body.get("cour_id"));
    }

    @RequestMapping("/updateCourse")
    public Object updateCourse(@RequestBody Course course) {
        return adminService.updateCourse(course);
    }

    @RequestMapping("/getLecturerList")
    public Object getLecturerList(@RequestBody Lecturer lecturer){
        return adminService.getLecturerList(lecturer);
    }

    @RequestMapping("/addLecturer")
    public Object addLecturer(@RequestBody Lecturer lecturer) {
        return adminService.addLecturer(lecturer);
    }

    @RequestMapping("/dropLecturer")
    public Object dropLecturer(@RequestBody Map<String, String> body) {
        return adminService.dropLecturer(body.get("lect_id"));
    }

    @RequestMapping("/getStudentList")
    public Object getStudentList(@RequestBody Map<String, String> body) {
        return adminService.getStudentList(body);
    }

    @RequestMapping("/addStudent")
    public Object addStudent(@RequestBody Student student) {
        return adminService.addStudent(student);
    }

    @RequestMapping("/dropStudent")
    public Object dropStudent(@RequestBody Map<String, String> body) {
        return adminService.dropStudent(body.get("stud_id"));
    }

    @RequestMapping("/addCurriculum")
    public Object addCurriculum(@RequestBody Curriculum curriculum) {
        return adminService.addCurriculum(curriculum);
    }

    @RequestMapping("/dropCurriculum")
    public Object dropCurriculum(@RequestBody Curriculum curriculum) {
        return adminService.dropCurriculum(curriculum);
    }
}
