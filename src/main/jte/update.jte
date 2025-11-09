@param java.util.List<com.system.DigitalBankingApplication.model.Account> fetchAccount

<html>
<body bgcolor="#90ee90" style="text-align:center;" topmargin="200px">

<div>
    <form action="/update-account" method="GET">

        <label for="phoneNumber">Phone Number:</label>
        <input type="text" name="phoneNumber" id="phoneNumber" placeholder="Enter Your Phone Number">
        <br><br>
        <label for="accountNumber">Account Number:</label>
        <input type="text" name="accountNumber" id="accountNumber" placeholder="Enter Your Account Number">
        <br><br>
        <button type="submit" name="submit">Search Account</button>
    </form>
</div>

<form action="/update-account" method="POST">
    <div>
            @if(fetchAccount != null && !fetchAccount.isEmpty())
                @for(com.system.DigitalBankingApplication.model.Account account : fetchAccount)
                    <input type="text" name="accountName" id="accountName" value="${account.getAccountName()}"><br><br>
                    <input type="text" name="phoneNumber" id="phoneNumber" value="${account.getPhoneNumber()}"><br><br>
                    <input type="text" name="email" id="email" value="${account.getEmail()}"><br><br>
                    <input type="text" name="address" id="address" value="${account.getAddress()}"><br><br>
                @endfor
                <button type="submit" name="submit" id="submit">Update</button><br><br>
            @else
                <li>No accounts found</li>
            @endif
    </div>
</form>


</body>
</html>