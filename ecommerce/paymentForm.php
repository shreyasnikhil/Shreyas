<!DOCTYPE html>
<html>

<head>
    <title>Payment</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" href="external4.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>

<body>
    <div class="main-w3layouts wrapper">
        <h1>Payment</h1>
        <div class="main-agileinfo">

            <div class="agileits-top">
                <form action="credit.php" method="post">
                    <label for="fname">Accepted Cards</label>
                    <div class="icon-container" style="margin-left: 10px;">
                        <i class="fa fa-cc-visa" style="color:navy;"></i>
                        <i class="fa fa-cc-amex" style="color:blue;"></i>
                        <i class="fa fa-cc-mastercard" style="color:red;"></i>
                        <i class="fa fa-cc-discover" style="color:orange;"></i>
                    </div>
                    <label for="cname">Name on Card</label>
                    <input type="text" id="cname" name="cardname" placeholder="Shreyas">
                    <label for="ccnum">Credit card number</label>
                    <input type="text" id="ccnum" name="cardnumber" placeholder="1111-2222-3333-4444">
                    <label for="expmonth">Exp Month</label>
                    <input type="text" id="expmonth" name="expmonth" placeholder="September">
                    <div class="row">
                        <div class="col-50">
                            <label for="expyear">Exp Year</label>
                            <input type="text" id="expyear" name="expyear" placeholder="2018">
                        </div>
                        <div class="col-50">
                            <label for="cvv">CVV</label>
                            <input type="password" id="cvv" name="cvv" placeholder="352">
                        </div>

                        <input type="submit" value="Pay" name="submitbutton">
                </form>

            </div>
        </div>
</body>

</html>