<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Details</title>
</head>
<body>
    <h1>${product.name}</h1>
    <p>Description: ${product.description}</p>
    <p>Price: ${product.price}</p>
    <img src="${product.imageUrl}" alt="Product Image" />
    <br />
    <a href="/products">Back to Product List</a>
</body>
</html>
