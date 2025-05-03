package com.example.Its.web.issue;

import java.util.List;
import org.springframework.ui.Model;
import com.example.Its.domain.issue.IssueEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class issueController {
    @GetMapping("/issues")
    public String showIssues(Model model){
        var issueList = List.of(
                new IssueEntity(1,"Fail to Update", "説明"),
                new IssueEntity(2,"Connection Error From DB", "説明"),
                new IssueEntity(3,"Testing Improvement", "説明")
        );
        model.addAttribute("issueList", issueList);
        return "issues/list";
    }
}
