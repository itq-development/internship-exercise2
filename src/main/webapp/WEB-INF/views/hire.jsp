<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>

<jsp:include page="../views/components/head.jsp"/>

<c:url value="/hire/employee" var="hireEmployee"/>


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
        <div class="col-md-6 col-md-offset-3">
            <h2>Add Employee to Company</h2>
            <br>
            <form method="POST" action="${hireEmployee}">
                <div class="form-group">
                    <div class="form-group-sm">

                        <form:label path="selectedEmployee">Choose employee:</form:label>
                        <form:select name="selectedEmployee" path="selectedEmployee" cssClass="form-horizontal">
                            <form:options items="${employeesList}" itemValue="id" itemLabel="name"/>
                        </form:select>

                        <form:label path="selectedCompany">Choose company:</form:label>
                        <form:select name="selectedCompany" path="selectedCompany" cssClass="form-horizontal">
                            <form:options items="${companiesList}" itemValue="id" itemLabel="title"/>
                        </form:select>

                    </div>
                </div>
                <button type="submit" class="btn btn-default">Hire him</button>
            </form>
        </div>
    </div>
</div>

<jsp:include page="../views/components/footer.jsp"/>

</body>
</html>
