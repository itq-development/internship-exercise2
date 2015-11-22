<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>

<jsp:include page="../views/components/head.jsp"/>

<body>

    <header>
        <div class="jumbotron">
            <div class="container">
                <h1>Did you know that..</h1>
            </div>
        </div>
    </header>

    <div class="container">
        <article>
            <h2>...in 101 cases from 100, manufacturers indicate wrong consumption of the car ?</h2>
            <hr>
        </article>
    </div>

    <div class="container">
        <div class="calculator">
            <h2>Let's calculate your "real" fuel consumption!</h2>
        </div>
    </div>
    <hr>
    <div class="container">
        <div class="row">
            <div class="col-md-6 calculator">
                <form:form method="get" commandName="consumption" action="/">
                    <div class="form-group">
                        <form:label path="liters">Fuel (in liters):</form:label>
                        <form:input type="number" path="liters" class="form-control"/>
                    </div>
                    <div class="form-group">
                        <form:label path="kilometers">Journey driven (in kilometers):</form:label>
                        <form:input type="number" path="kilometers" class="form-control"/>
                    </div>
                    <button type="submit" class="btn btn-default">Calculate</button>
                </form:form>
            </div>
            <div class="col-md-6 calculator">
                <div class="col-md-offset-3 col-md-6 result-block">
                    <p>On the average it </p>

                    <p class="result-value">${calc.calculating()}</p>

                    <p>liter(s) per 100 km</p>
                </div>
            </div>
        </div>
    </div>

    <jsp:include page="../views/components/footer.jsp"/>

</body>
</html>
