<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <jsp:include page="tiles/locale.jsp"/>
</head>
<body>
<h2><spring:message code="welcome.label.welcome"/></h2>

<div id="login-box">

    <h3><spring:message code="welcome.label.login"/></h3>

    <c:if test="${not empty error}">
        <div class="error">${error}</div>
    </c:if>
    <c:if test="${not empty msg}">
        <div class="msg">${msg}</div>
    </c:if>

    <form name='loginForm' action="<c:url value='/j_spring_security_check' />" method='POST'>

        <table>
            <tr>
                <td><spring:message code="welcome.label.userEntity"/></td>
                <td>
                    <input type='text' name='username'>
                </td>
            </tr>
            <tr>
                <td><spring:message code="welcome.label.password"/></td>
                <td>
                    <input type='password' name='password'/>
                </td>
            </tr>
            <tr>
                <td colspan='2'>
                    <input name="submit" type="submit" value="<spring:message code="welcome.label.enter"/>"/>
                </td>
            </tr>
        </table>


    </form>
</div>

</body>
</html>
