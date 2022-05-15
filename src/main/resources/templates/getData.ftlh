<html>
    <style>
    table, th, td {
      border:1px solid black;
    }
    </style>
    <head>
        <title>Start page</title>
    </head>
    <body>
    <table style="width:50%">
      <tr>
        <th>Data</th>
        <th>Date of creation</th>
        <th>Tag name</th>
        <th>Report type</th>
      </tr>
      <#list TagData as data>
        <tr>
          <th>${data.data}</th>
          <th>${data.dateCreation}</th>
          <th>${data.tagName.name}</th>
          <th>${data.reportType.name}</th>
        </tr>
      </#list>
    </table>
    </body>
</html>