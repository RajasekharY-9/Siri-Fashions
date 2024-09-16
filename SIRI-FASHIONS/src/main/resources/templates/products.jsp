<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product List</title>
</head>
<body>
    <h1>Product List</h1>
    <div>
        <c:forEach var="product" items="${products}">
            <h2>${product.name}</h2>
            <p>${product.description}</p>
            <p>Price: ${product.price}</p>
            <img src="${product.imageUrl}" alt="Product Image" />
            <hr />
        </c:forEach>
    </div>
</body>
</html>
