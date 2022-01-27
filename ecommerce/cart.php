<html>
<head>
<style>
        table {
            font-family: Arial, Helvetica, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td,
        th {
            border: 1px solid #ddd;
            padding: 8px;
        }

        tr:hover {
            background-color: #ddd;
        }

        th {
            padding-top: 12px;
            padding-bottom: 12px;
            text-align: left;
            background-color: rgb(0, 139, 252);
            color: white;
        }
        .link-button { 
             
            border: 2px solid green; 
            color: green; 
            outline: medium none; 
            font-size: x-large;
            text-decoration: none; 
            float: right;
            margin-right:105px;
            margin-top:10px;
            margin-bottom:10px;
            border-radius:10px;
        }
        .link-button1 { 
             
            border: 2px solid red; 
            color: red; 
            outline: medium none; 
            font-size: x-large;
            text-decoration: none; 
            float: right;
            margin-right:140px;
            margin-top:10px;
            margin-bottom:10px;
            border-radius:10px;
         }
    </style>
</head>
<body>
<h1> Order Details </h1>
<a href="delete.php" class="link-button1">Empty Cart</a>

<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "ecommerce"; 

// Create connection
$conn = mysqli_connect($servername, $username, $password, $dbname);

// Check connection
if (!$conn) {
  die("Connection failed: " . mysqli_connect_error());
}

?>
<?php
$total_price=0;
?>
<table>

<tr>
<th> Name </th>
<th> Price </th>
</tr>

<?php 
$retval = mysqli_query($conn, 'SELECT * from tblproduct');
while($row = mysqli_fetch_array($retval)) {
?>
<tr>
  <td> <?php echo $row['name']; ?> </td>
<td> <?php echo $row['price']; ?> </td>
</tr>

<?php 
$total_price+= ($row["price"]);
}?>
<tr>
    <td>Total</td>
    <td><?php
     echo '₹';
     echo $total_price; ?></td>
</tr>
<?php
mysqli_close($conn);
?>
</table>
<a href="paymentForm.php" class="link-button">Proceed to buy</a>
</body>
</html>
