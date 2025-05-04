package com.example.Its.domain.issue;

import java.util.List;

public class IssueService {
    public List<IssueEntity> findAll(){
        return List.of(
                new IssueEntity(1,"Fail to Update", "説明"),
                new IssueEntity(2,"Connection Error From DB", "説明"),
                new IssueEntity(3,"Testing Improvement", "説明")
        );
    }

}
