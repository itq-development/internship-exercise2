<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>

<jsp:include page="../views/components/head.jsp"/>

<body>
<header>
    <div class="jumbotron">
        <div class="container">
            <h1>What do you want to find out?</h1>
        </div>
    </div>
</header>

<div class="container">
    <div class="center">
        <h2>Choose URL</h2>
    </div>
</div>
<hr>
<div class="container min-height">
    <div class="row">
        <div class="col-md-4">
            <a href="structures">
                <div class="btn btn-lg btn-default">Structures</div>
            </a>
        </div>
        <div class="col-md-4">
            <a href="employees">
                <div class="btn btn-lg btn-default">Employees</div>
            </a>
        </div>
        <div class="col-md-4">
            <a href="operations">
                <div class="btn btn-lg btn-default">Operations</div>
            </a>
        </div>
    </div>
</div>

<jsp:include page="../views/components/footer.jsp"/>

</body>
</html>
