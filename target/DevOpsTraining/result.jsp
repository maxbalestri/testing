<%@ page import="mypackage.Factor" %>
<html>
<body>

<%
int risultato=Factor.factor(Integer.parseInt(request.getParameter("Numero")));
%>

<h2>Calcolo fattoriale di un numero( ciao ciao ) </h2>
Risultato : <%= risultato %>

</body>
</html>