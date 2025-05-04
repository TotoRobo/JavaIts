package com.example.Its.domain.issue;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
/*
--@Data adds Annotations--
@ToString
@EqualsAndHashCode
@Getter on all fields
@Setter on all non-final fields
@RequiredArgsConstructor
-------------------------
 */
public class IssueEntity {
    private long id;
    private String summary;
    private String description;
}
