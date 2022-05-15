package test.task.report.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.task.report.controller.FormData;
import test.task.report.entity.ReportType;
import test.task.report.entity.TagData;
import test.task.report.repository.TagDataRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class DataService {
    @Autowired
    TagDataRepository repo;

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public List<TagData> getDataByReportIdAndDate(FormData formData) {
        String dateStartStr = formData.getDateStart();
        String timeStartStr = formData.getTimeStart();
        String dateEndStr = formData.getDateEnd();
        String timeEndStr = formData.getTimeEnd();

        if (dateStartStr.isEmpty()) dateStartStr = "1000-01-01";
        if (timeStartStr.isEmpty()) timeStartStr = "00:00";
        if (dateEndStr.isEmpty()) dateEndStr = String.valueOf(LocalDate.now());
        if (timeEndStr.isEmpty()) timeEndStr = "00:00";

        String dateTimeStart = dateStartStr + "T" + timeStartStr;
        String dateTimeEnd = dateEndStr + "T" + timeEndStr;
        LocalDateTime dateStart = LocalDateTime.parse(dateTimeStart);
        LocalDateTime dateEnd = LocalDateTime.parse(dateTimeEnd);

        return repo.getDataByReportIdAndDate(dateStart, dateEnd, formData.getReportId());
    }

    public List<ReportType> getAllReportTypes() {
        return repo.getAllReportTypes();
    }
}
