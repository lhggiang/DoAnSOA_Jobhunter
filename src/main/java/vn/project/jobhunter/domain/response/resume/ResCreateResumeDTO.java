package vn.project.jobhunter.domain.response.resume;

import java.time.Instant;

import lombok.*;

@Getter
@Setter
public class ResCreateResumeDTO {
    private long id;
    private Instant createdAt;
    private String createdBy;
}
