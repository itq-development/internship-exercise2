<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>

<jsp:include page="../views/components/head.jsp"/>

<body>

<header>
    <div class="jumbotron">
        <div class="container">
            <h1>Structures</h1>
        </div>
    </div>
</header>

<div class="container">
    <div class="center">
        <h2>Get all Structures</h2>
    </div>
</div>
<hr>
<div class="container">
    <div class="row">
        <div class="col-md-6 center">
            <form:form method="get" commandName="users" action="/structures">
                <button type="submit" class="btn btn-default">Find!</button>
            </form:form>
        </div>
        <div class="col-md-6 center">
            <div class="col-md-offset-3 col-md-6 result-block">
                <p></p>

                <p class="result-value"></p>

                <p></p>
            </div>
        </div>
    </div>
</div>

<jsp:include page="../views/components/footer.jsp"/>

</body>
</html>
