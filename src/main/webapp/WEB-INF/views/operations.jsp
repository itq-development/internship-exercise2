<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>

<jsp:include page="../views/components/head.jsp"/>

<c:url value="/operations/add/company" var="addCompany"/>
<c:url value="/operations/remove/company/" var="removeCompany"/>

<c:url value="/operations/add/employee" var="addEmployee"/>
<c:url value="/operations/remove/employee/" var="removeEmployee"/>

<body>

<header>
    <div class="jumbotron">
        <div class="container">
            <h1>Miscellaneous Operations</h1>
        </div>
    </div>
</header>
<hr>
<div class="container min-height">
    <div class="row">
        <div class="col-md-6 center">
            <h2>Employee</h2>
            <form:form commandName="employee" action="${addEmployee}">
                <div class="form-group">
                    <form:label path="name">Enter the name of new employee </form:label>
                    <form:input path="name" cssClass="form-control"/>

                    <form:label path="sex">Enter the sex of new employee </form:label>
                    <form:input path="sex" cssClass="form-control"/>

                    <form:label path="age">Enter the age of new employee</form:label>
                    <form:input path="age" cssClass="form-control"/>

                    <form:label path="companies">Which company does the employee work?</form:label>
                    <form:input path="companies" cssClass="form-control"/>

                    <form:label path="position">Position of new employee</form:label>
                    <form:input path="position" cssClass="form-control"/>
                </div>
                <button type="submit" class="btn btn-default">Add</button>
            </form:form>
        </div>
        <%--        <div class="col-md-6 center">
                    <div class="row">

                    </div>
                </div>--%>
    </div>
</div>

<jsp:include page="../views/components/footer.jsp"/>

</body>
</html>
