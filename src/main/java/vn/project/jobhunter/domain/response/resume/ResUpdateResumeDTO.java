package vn.project.jobhunter.domain.response.resume;

import java.time.Instant;
import lombok.*;

@Getter
@Setter
public class ResUpdateResumeDTO {
    private Instant updatedAt;
    private String updatedBy;
}
