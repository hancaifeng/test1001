<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>ajax前期准备</title>
    <script type="text/javascript" src="js/jquery-3.6.0.js"></script>
    <script type="text/javascript">
      $(function () {
        $("#btn").click(function () {
          $.ajax({
            url:"AServlet",
            type:"Get",
            dataType:"json",
            async:true,
            success:function (data) {
              $("#div1").text(data);
            }
          })
        })
      })
    </script>
    <style type="text/css">
      div{
        width: 200px;
        height: 200px;
        background-color: antiquewhite;
      }
    </style>
  </head>
  <body>
    <button id="btn">按钮</button>
    <div id="div1">

    </div>
  </body>
</html>
