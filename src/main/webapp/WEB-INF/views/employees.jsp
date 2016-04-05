<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>

<jsp:include page="../views/components/head.jsp"/>

<body>

<header>
    <div class="jumbotron">
        <div class="container">
            <h1>Users</h1>
        </div>
    </div>
</header>

<div class="container">
    <div class="center">
        <h2>Get users via Structure</h2>
    </div>
</div>
<hr>
<div class="container">
    <div class="row">
        <div class="col-md-6 center">
            <form:form method="get" commandName="company" action="/employees">
                <div class="form-group">
                    <form:label path="company">Enter the structure title</form:label>
                    <form:input type="text" path="company" class="form-control"/>
                </div>
                <button type="submit" class="btn btn-default">Find!</button>
            </form:form>
        </div>
        <div class="col-md-6 center">
            <div class="col-md-offset-3 col-md-6 result-block">
                <c:forEach items="${employeesList}" var="employees">
                    <hr>
                    <div class="row">
                        <ul>
                            <li>ID = ${employees.id}</li>
                            <li>NAME = ${employees.name}</li>
                            <li>POSITION = ${employees.position}</li>
                            <li>SEX = ${employees.sex}</li>
                            <li>AGE = ${employees.age}</li>
                        </ul>
                    </div>
                    <hr>
                </c:forEach>
            </div>
        </div>
    </div>
</div>

<jsp:include page="../views/components/footer.jsp"/>

</body>
</html>
