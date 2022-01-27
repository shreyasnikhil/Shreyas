<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "ecommerce";
$conn = new mysqli($servername, $username, $password, $dbname);
// database insert SQL code
$sql = "INSERT INTO tblproduct VALUES ('Adidas Black Jacket',1423)";
if ($conn->query($sql) === TRUE) {
  header('Location:cart.php');
} else {
  echo "Error: " . $sql . "<br>" . $conn->error;
}
$conn->close();
?>