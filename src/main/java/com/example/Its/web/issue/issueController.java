package com.example.Its.web.issue;

import com.example.Its.domain.issue.IssueService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class issueController {

    private final IssueService issueService;

    @GetMapping("/issues")
    public String showIssues(Model model){
        model.addAttribute("issueList", issueService.findAll());
        return "issues/list";
    }
}
