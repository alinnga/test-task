package test.task.report.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@ToString
public class TagName {
    @Id
    private long id;
    private String name;
    private String description;
}