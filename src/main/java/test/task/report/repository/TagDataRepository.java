package test.task.report.repository;

import org.springframework.stereotype.Repository;
import test.task.report.entity.ReportType;
import test.task.report.entity.TagData;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Repository
@Transactional
public class TagDataRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<TagData> getDataByReportIdAndDate(LocalDateTime dateStart, LocalDateTime dateEnd, long reportId){
        String query = """
                FROM TagData
                WHERE report_id = :id
                AND date_creation
                BETWEEN :sDate AND :eDate
                """;
        return entityManager.createQuery(query)
                .setParameter("id", reportId)
                .setParameter("sDate", dateStart)
                .setParameter("eDate", dateEnd)
                .getResultList();
    }

    public List<ReportType> getAllReportTypes() {
        return entityManager
                .createQuery("FROM ReportType")
                .getResultList();
    }
}
