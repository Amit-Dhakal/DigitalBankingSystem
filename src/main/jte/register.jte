<html>
<body>

<div>
    <form action="/register-account" method="post" >
        <label for="accountName">Account Name:</label>
        <input type="text" name="accountName" id="accountName" placeholder="Enter Your Name">
        <br><br>
        <label for="address">Address:</label>
        <input type="text" name="address" id="address" placeholder="Enter Your Address">
        <br><br>
        <label for="email">Email :</label>
        <input type="text" name="email" id="email" placeholder="Enter Your Email">
        <br><br>
        <label for="phoneNumber">Phone Number:</label>
        <input type="text" name="phoneNumber" id="phoneNumber" placeholder="Enter Your Phone Number">
        <br><br>
<%--        <label for="transactionDate">Phone Number:</label>--%>
<%--        <input type="text" name="transactionDate" id="transactionDate" placeholder="Enter Transaction Date">--%>
<%--        <br><br>--%>
        <button type="submit" name="submit" value="Save Your Detail">Save Account</button><br><br>
    </form>
</div>

</body>
</html>
