<%@page import="com.javatpoint.dao.UserDao"%>  
<jsp:useBean id="u" class="com.javatpoint.bean.User"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
  
<%  
int i=UserDao.update(u);  
if(i>0){  
response.sendRedirect("weblogout.jsp");  
}else{  
response.sendRedirect("weblogout.jsp");  
}  
%>