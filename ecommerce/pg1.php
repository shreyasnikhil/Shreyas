<html>
    <head>
        <title>Page1</title>
        <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <style>
            body{
                background-color:white;
            }
            .h{
              color:white;
              background-color:green;
              font-family: 'Courier New', Courier, monospace;
            }
            
            h2 a{
              color: black;
              text-decoration: none !important;
            }
            figcaption{
              text-align: center;
            }
            figcaption a{
              color: white;
              background-color: green;
              text-decoration: none !important;
              font-style: italic;
              font-size:x-large;
            }

            figcaption a:hover{
              color:hotpink;
            }
             
            .center {
              display: block;
              margin-left: auto;
              margin-right: auto;
              width: 50%;
            }

           .css-christmas-color {
             background: linear-gradient(90deg, #6bbeee,#d1d1d1, #e68cc3, #6bbeee,#d1d1d1,#e68cc3 );
             color: #0000;
            -webkit-background-clip: text;
             background-clip: text;
             font-size: 50px;
             font-weight: bold;
             font-style:italic;
             display: inline-block;
            }

            .on{
              color:black;
            }
            #a{
              box-sizing:border-box;
              float:center;
              height:50%;
              width:40%;
            }
            #b{
              box-sizing:border-box;
              float:center;
              height:50%;
              width:40%;

            }
            #c{
              box-sizing:border-box;
              float:center;
              height:50%;
              width:40%;
            }
            #color{
              text-align: center;
            }
            .w{
              color:black;
              background-color:wheat;
              font-size:20px;
            }
            .carousel-control-prev-icon, .carousel-control-next-icon {
               height: 50px;
               width: 50px;
               outline: black;
               background-color:black;
               background-size: 50%, 50%;
               border-radius: 50%;
               border: 1px solid black;
              }
            .row{
                clear:both;
                display:table;
              }
              .column{
                float:left;
                width: 500px;
                padding: 5px;
            }

        </style>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
      <div class="h">&nbsp; &nbsp;&nbsp;
            <i class="fa fa-phone">999-999-999</i>&nbsp; &nbsp;&nbsp;
             <i class="fa fa-envelope">soul@gmail.com</i>&nbsp; &nbsp;&nbsp;
             <i class="fa fa-clock-o">Mon-Fri 9.00-5.00 EST</i>
      </div>  
    <h2>&nbsp;&nbsp;
      <div class="css-christmas-color">Soul Clothing</div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <a href="women.php">Women-wear</a>&nbsp;&nbsp;&nbsp;&nbsp;
      <a href="men.php">Men-wear</a>&nbsp;&nbsp;&nbsp;&nbsp;
      <a href="kids.php">Kids-wear</a>&nbsp;&nbsp;&nbsp;&nbsp;
      <a href="about.php">About Us</a>&nbsp;&nbsp;&nbsp;&nbsp;
      <a href="signup.php">Login</a>

    </h2>
      <!-- Optional JavaScript; choose one of the two! -->
  
      <!-- Option 1: Bootstrap Bundle with Popper -->
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
  
      <div id="carouselExampleInterval" class="carousel slide" data-bs-ride="carousel">
          <div class="carousel-inner">
            <div class="carousel-item active" id="color" data-bs-interval="10000">
              <img src="https://i.pinimg.com/originals/81/28/02/812802a59c368d0be0ba0410bfde0f39.jpg" class="b-5"   alt="..."  id="a"></br>
            </div>
            <div class="carousel-item" id="color" data-bs-interval="2000">
              <img src="https://media1.mensxp.com/media/content/2016/Dec/best-online-shopping-sites-for-men-980x457-1481709884_1100x513.jpg" class="b-5" alt="..."  id="b">
            </br>
           </div>
            <div class="carousel-item" id="color">
              <img src="http://www.cstylejeans.com/wp-content/uploads/2016/02/childrens-fashion-australia.jpg" class=" b-5" alt="..."  id="c">
             </br>
            </div>
          </div>
          <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleInterval" data-bs-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Previous</span>
          </button>
          <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleInterval" data-bs-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Next</span>
          </button>
        </div>
    
    <div class="row">
      <div class="column">
        <figure>
          <img src="https://i.pinimg.com/736x/d5/fd/12/d5fd129e27ba314839e80bfd974b048d.jpg"  class="center" style="width: 47%">
          <figcaption><strong><a  href="newarrival.php" >&nbsp;&nbsp;&nbsp;New Arrivals</a></strong></figcaption>
          </figure>
      </div>

      <div class="column">
        <figure>&nbsp;&nbsp;&nbsp;
            <img src="https://cdn5.vectorstock.com/i/1000x1000/21/39/limited-collection-and-edition-clothing-labels-vector-1712139.jpg" class="center"  style="width:38%">
            <figcaption> <strong><a  href="limited.php" >&nbsp;&nbsp;&nbsp;Limited Collection</a></strong></figcaption>
            </figure>
      </div>
  
   
      <div class="column">
        <figure>
            <img src="https://thumbs.dreamstime.com/b/best-quality-banner-design-white-background-vector-illustration-136154355.jpg"  class="center" style="width:77%">
            <figcaption><strong><a  href="quality.php" >&nbsp;&nbsp;&nbsp;Best Quality</a></strong></figcaption>
          </figure>
        </div>
    </div>
  
  </body>
</html>