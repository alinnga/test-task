package test.task.report.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import test.task.report.entity.ReportType;
import test.task.report.entity.TagData;
import test.task.report.service.DataService;

import java.util.List;

@Controller
public class TagDataController {

    @Autowired
    private DataService service;

    @GetMapping("/start")
    public String startPage(Model model){
        List<ReportType> reportTypes = service.getAllReportTypes();
        model.addAttribute("reportTypes", reportTypes);
        return "startPage";
    }

    @GetMapping(path = "/report")
    public String getTagData(@ModelAttribute FormData formData, Model model){
        List<TagData> data = service.getDataByReportIdAndDate(formData);
        model.addAttribute("TagData", data);
        return "getData";
    }

}
