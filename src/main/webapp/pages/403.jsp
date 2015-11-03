<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<body>
<h1><spring:message code="accessdenied.label.status403"/></h1>

<c:choose>
    <c:when test="${empty username}">
        <h2><spring:message code="accessdenied.label.notpermission"/></h2>
    </c:when>
    <c:otherwise>
        <h2><spring:message code="accessdenied.label.username"/> ${username} <br/><spring:message
                code="accessdenied.label.notpermission"/></h2>
    </c:otherwise>
</c:choose>

</body>
</html>