<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
<div class="container min-height">
    <hr>
    <div class="row">
        <div class="col-md-6">
            <h2>Add Employee</h2>
            <br>
            <form:form method="POST" commandName="employee" action="${addEmployee}">
                <div class="form-group">
                    <div class="form-group-sm">
                        <form:label path="name">Enter the name of new employee: </form:label>
                        <form:input path="name" cssClass="form-horizontal"/>
                    </div>
                    <div class="form-group-sm">
                        <form:label path="sex">Enter the sex of new employee: </form:label>
                        <form:input path="sex" cssClass="form-horizontal"/>
                    </div>
                    <div class="form-group-sm">
                        <form:label path="age">Enter the age of new employee:</form:label>
                        <form:input path="age" cssClass="form-horizontal"/>
                    </div>
                        <%--
                                            <div class="form-group-sm">
                                                <form:label path="parent">Where does the employee work:</form:label>
                                                <form:input path="parent" cssClass="form-horizontal"/>
                                            </div>
                        --%>
                    <div class="form-group-sm">
                        <form:label path="position">Position of new employee: </form:label>
                        <form:input path="position" cssClass="form-horizontal"/>
                    </div>
                </div>
                <button type="submit" class="btn btn-default">Add</button>
            </form:form>
        </div>
        <div class="col-md-6">
            <h2>Remove Employee</h2>
            <br>
            <div class="col-md-12">
                <form:form method="get" commandName="employee" action="${removeEmployee}">
                    <div class="form-group">
                        <div class="form-group-sm">
                            <form:label path="id">Enter id of employee:</form:label>
                            <form:input path="id" cssClass="form-horizontal"/>
                        </div>
                    </div>
                    <button type="submit" class="btn btn-default">Remove</button>
                </form:form>
            </div>
        </div>
    </div>

    <hr>

    <div class="row">
        <div class="col-md-6">
            <h2>Add Company</h2>
            <br>
            <form:form method="POST" commandName="company" action="${addCompany}">
                <div class="form-group">
                    <div class="form-group-sm">
                        <form:label path="title">Enter the company's title:</form:label>
                        <form:input path="title" cssClass="form-horizontal"/>
                    </div>
                    <div class="form-group-sm">
                        <form:label path="slogan">Enter the slogan (if present):</form:label>
                        <form:input path="slogan" cssClass="form-horizontal"/>
                    </div>
                    <div class="form-group-sm">
                        <form:label path="parent">Enter the parent-structure:</form:label>
                        <form:input path="parent" cssClass="form-horizontal"/>
                    </div>
                </div>
                <button type="submit" class="btn btn-default">Add</button>
            </form:form>
        </div>
        <div class="col-md-6">
            <h2>Remove Company</h2>
            <br>
            <div class="col-md-12">
                <form:form method="get" commandName="company" action="${removeCompany}">
                    <div class="form-group">
                        <div class="form-group-sm">
                            <form:label path="id">Enter id of the company:</form:label>
                            <form:input path="id" cssClass="form-horizontal"/>
                        </div>
                    </div>
                    <button type="submit" class="btn btn-default">Remove</button>
                </form:form>
            </div>
        </div>
    </div>
</div>

<jsp:include page="../views/components/footer.jsp"/>

</body>
</html>
