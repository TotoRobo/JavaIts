package com.example.Its.web.issue;

import com.example.Its.domain.issue.IssueService;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class issueController {

    private final IssueService issueService = new IssueService();

    @GetMapping("/issues")
    public String showIssues(Model model){
        model.addAttribute("issueList", issueService.findAll());
        return "issues/list";
    }
}
