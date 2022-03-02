<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>json前期准备</title>
    <script type="text/javascript" src="js/jquery-3.6.0.js"></script>
    <script type="text/javascript">
      $(function () {
        $("#btn").click(function () {
          $.ajax({
            url:"BServlet",
            type:"Get",
            dataType:"json",
            async:true,
            success:function (data) {
              alert(data.stu1.id);
              alert(data.stu1.name);
              alert(data.stu1.age);
              alert(data.stu2.id);
              alert(data.stu2.name);
              alert(data.stu2.age);
            }
          })
        })
      })
    </script>
  </head>
  <body>
    <button id="btn">按钮</button>
    <span id="id1"></span>
  </body>
</html>
