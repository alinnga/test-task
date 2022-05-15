package test.task.report.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
@Data
public class TagData {
    @Id
    private long id;
    private double data;
    private LocalDateTime dateCreation;

    @ManyToOne
    @JoinColumn(name = "name_id")
    private TagName tagName;

    @ManyToOne
    @JoinColumn(name = "report_id")
    private ReportType reportType;

}
