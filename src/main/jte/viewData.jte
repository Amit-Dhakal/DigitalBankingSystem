@param java.util.List<com.system.DigitalBankingApplication.model.Account> accountList

<!DOCTYPE html>
<html>
<body>
<table bgcolor="#ffd700" border="10px solid green">
    <div>
        <tr>
            <th>S.N</th>
            <th>ACCOUNT HOLDER NAME</th>
            <th>ADDRESS</th>
            <th>EMAIL</th>
            <th>PHONE NUMBER</th>
        </tr>
       @for(com.system.DigitalBankingApplication.model.Account acc: accountList)
         <tr>
             <td>${acc.getAccountId()}</td>
             <td>${acc.getAccountName()}</td>
            <td>${acc.getAddress()}</td>
            <td>${acc.getEmail()}</td>
            <td>${acc.getPhoneNumber()}</td>
        </tr>
     @endfor
    </div>
</table>
</body>
</html>