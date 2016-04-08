<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>

<jsp:include page="../views/components/head.jsp"/>


<c:url value="/employees/employees/where/does/he/work" var="workPlace"/>

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
        <h2>Get information about Employees</h2>
    </div>
</div>
<hr>
<div class="container min-height">
    <div class="row">
        <div class="col-md-6 center">
            <form class="col-md-4" method="POST" action="${workPlace}">
                <div class="form-group">
                    <form:label path="selectedEmployee">Choose employee:</form:label>
                    <form:select name="selectedEmployee" path="selectedEmployee" cssClass="form-horizontal">
                        <form:options items="${entireEmployeesList}" itemValue="id" itemLabel="name"/>
                    </form:select>
                </div>
                <button type="submit" class="btn btn-default">Find!</button>
            </form>
            <div class="col-md-8 result">

                <table class=" table table-hover">
                    <thead>
                    <tr>
                        <th>id</th>
                        <th>title</th>
                        <th>slogan</th>
                        <th>parent</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${queriedCompanies}" var="targetCompany">
                        <tr>
                            <th scope="row">${targetCompany.id}</th>
                            <td>${targetCompany.title}</td>
                            <td>${targetCompany.slogan}</td>
                            <td>${targetCompany.parent.title} (${targetCompany.parent.id})</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>

            </div>
        </div>
        <div class="col-md-6 center">
            <div class="row">
                <c:forEach items="${employeesList}" var="employees">
                    <div class="col-md-6">
                        <ul>
                            <li>ID = ${employees.id}</li>
                            <li>NAME = ${employees.name}</li>
                            <li>SEX = ${employees.sex}</li>
                            <li>AGE = ${employees.age}</li>
                            <li>POSITION = ${employees.position}</li>
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
