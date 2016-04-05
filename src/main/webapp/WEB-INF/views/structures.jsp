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
<div class="container min-height">
    <div class="row">
        <div class="col-md-10 col-md-offset-1 center">
            <div class="row">
                <c:forEach items="${structuresList}" var="structures">
                    <div class="col-md-3">
                        <ul>
                            <li>ID = ${structures.id}</li>
                            <li>TITLE = ${structures.title}</li>
                            <li>SLOGAN = ${structures.slogan}</li>
                        </ul>
                        <hr>
                    </div>
                </c:forEach>
            </div>
        </div>
    </div>
</div>

<jsp:include page="../views/components/footer.jsp"/>

</body>
</html>
