<html>
    <head>
        <title>Start page</title>
    </head>
    <body>
    <form action="/report" method="get" enctype="multipart/form-data">
        <label for="report"> Выберите тип отчета:
            <select name="reportId" id="reportId">
                <#list reportTypes as reportType>
                    <option value="${reportType.id}">${reportType.name}</option>
                </#list>
            </select><br>
        </label>
        <label> Выберите дату и время (начало):
            <input type="date" name="dateStart" id="dateStart">
            <input type="time" name="timeStart" id="timeStart">
        </label>
        <br>
        <label> Выберите дату и время (конец):
             <input type="date" name="dateEnd" id="dateEnd">
             <input type="time" name="timeEnd" id="timeEnd">
        </label>
        <br>
        <button type="submit">Показать данные</button>
        <br>
    </form>
    </body>
</html>