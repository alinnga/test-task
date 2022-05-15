package test.task.report.controller;

import lombok.Data;

@Data
public class FormData {
    private String dateStart;
    private String timeStart;
    private String dateEnd;
    private String timeEnd;
    private long reportId;
}
