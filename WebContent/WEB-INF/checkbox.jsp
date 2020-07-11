<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

<form:form action="formTag/form.do" method="post" commandName="choose">  
    <table>  
        <tr>   
            <td>  
               <form:checkbox path="options" value="选项1" label="选项1"/><br/>  
               <form:checkbox path="options" value="选项2" label="选项2"/><br/>  
               <form:checkbox path="options" value="选项3" label="选项3"/>  
            </td>  
        </tr>  
    </table>  
    	<form:checkbox path="choose" value="true"/>已确定选择
</form:form> 


</body>
</html>