package com.example.exam.service;
import com.example.exam.repository.ExamRepository;
import com.example.exam.model.ExamModel;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExamService {
    ExamRepository repo;
    public ExamService(ExamRepository repo){
        this.repo=repo;
    }
    public List<ExamModel> getAll(){
        return repo.findAll();
    }
    public ExamModel get(String id){
        return repo.findById(id).orElse(null);
    }
    public void delete(String id){
         repo.deleteById(id);
    }
    public ExamModel create(ExamModel m){
        return repo.save(m);
    }
    public ExamModel update(ExamModel naya){
        return repo.save(naya);
    }

}
