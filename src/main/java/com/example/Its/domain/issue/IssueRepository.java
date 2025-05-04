package com.example.Its.domain.issue;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface IssueRepository {
    @Select("select * from issues;")
    List<IssueEntity> findAll();
}