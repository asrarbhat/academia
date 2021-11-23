package com.example.exam.controller;
import com.example.exam.model.ExamModel;
import com.example.exam.service.ExamService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExamController {
    ExamService service;
    public ExamController(ExamService service){
        this.service=service;
    }
    @GetMapping("/getAll")
    public List<ExamModel> getAll(){
        return service.getAll();
    }

    @GetMapping("/get/{id}")
    public ExamModel get(@PathVariable String id){
        return service.get(id);
    }

    @PostMapping("/create")
    public ExamModel create(@RequestBody ExamModel student) {
        return service.create(student);
    }

    @DeleteMapping("/delete/{Id}")
    public String delete(@PathVariable String Id) {
        service.delete(Id);
        return "Employee Deleted";
    }

    @PutMapping("/update")
    public ExamModel update(@RequestBody ExamModel student) {
        return service.update(student);
    }

}
