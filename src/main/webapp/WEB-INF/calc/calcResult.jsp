<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>NUM1 ${param.num1}</h1>
<h1>NUM2 ${param.num2}</h1>
<%--

${}
JSP에서 사용하는 EL이라는 기술
서버에서 데이터를 출력하는 용도로
웹에서 System.out.println()과 유사한 역할

--%>

<h1>SUM ${Integer.parseInt(param.num1) + Integer.parseInt(param.num2)}</h1>
<%-- 예를 들어 num1과 num2처럼 전달되는 모든 데이터는 문자열로 처리되기 때문에
결과 데이터를 처리하기 위해서는 clacResult.jsp를 다음과 같이
Integer.parseInt()를 적용해 다시 '${}'로 감싸서 처리
--%>

<%--
JSP는 기본적으로 GET/POST 방식의 호출을 구분하지 않기 때문에
POST 방식으로 접근해야하는 calcResult.jsp를 GET방식으로 얼마든지
호출할 수 있다는 문제가 있다. 이 경우는 Integer.parseInt()에서 문제가 발생

JSP에서 쿼리 스트링이나 파라미터를 처리하지 않는다. - JSP 대신 서블릿 통해서 처리
JSP는 입력 화면을 구성하거나 처리 결과를 보여주는 용도로만 사용
브라우저는 직접 JSP 경로로 호출하지 않고 서블릿 경로를 통해서 JSP는 보는 방식으로 사용
--%>
</body>
</html>

