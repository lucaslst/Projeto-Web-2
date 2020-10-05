<template>
<div class = "home">
 <body background="../assets/loginb.jpg"></body>
  <header>
    <div class="center">
    <nav>
      <ul>
        <li><img src="../assets/logof.png" alt="" height="140" width="300" > <img src="imagem/icone.png" height="40" width="50 " alt=""></li>
        <li><a href="#">Início</a></li>
        <li><a href="#">Genêros</a></li>
        <li><a href="#">Autores</a></li>
        <li><a href="#">Publicar</a></li>
        <li><a href="#">Perfil</a></li>
        <li>
          <form class="pesquisa">
            <input type="search" id="texto"  placeholder="Oq você procura?">
            <img src="../assets/lupa2-removebg-preview.png" height="48" width="60" walt="" class="btn">

          </form>
        </li>
      </ul>
    </nav>
  </div>
  </header>

  <div class = "container">
        <div class="row">
            <div class="col-4">
                <div class="card bg-light m-3" style="width: 15rem;  border-radius: 50px 50px 50px 50px;" >
                    <img class="card-img-top" src="../assets/av-removebg-preview.png" alt="Imagem de capa do card" style="background-color:indigo;  border-radius: 50px 50px 0px 0px;" >
                    <div class="card-body" style="background-color:indigo;  border-radius: 0px 0px 50px 50px;">
                      <h5 class="card-title text-center" style="color:ivory"> Olá, Usuário!</h5>
                      <p class="card-text"><img src="../assets/iconecartao.png" alt="erro" height="50" width="50" left="10px"></p>
                      <p style="color: ivory;">R$ 0,00</p>
                      <a href="#" class="btn btn-primary" style="color:ivory" > Adicione Crédito! </a>
                    </div>
                  </div>
            </div>

            <div class="col-8">
                <div id="slide" class="carousel slide m-3" data-ride="carousel">
                    <ol class="carousel-indicators">
                      <li data-target="#slide" data-slide-to="0" class="active"></li>
                      <li data-target="#slide" data-slide-to="1"></li>
                      <li data-target="#slide" data-slide-to="2"></li>
                    </ol>
                    <div class="carousel-inner">
                      <div class="carousel-item active">
                        <img class="d-block h-100 w-100" src="../assets/livros.png" alt="Primeiro Slide">
                      </div>
                      <div class="carousel-item">
                        <img class="d-block h-100 w-100" src="../assets/fevereiro-livros.jpg" alt="Segundo Slide">
                      </div>
                      <div class="carousel-item">
                        <img class="d-block h-100 w-100" src="../assets/slidep.jpeg" alt="Terceiro Slide">
                      </div>
                      <div class="carousel-item">
                        <img class="d-block h-100 w-100" src="../assets/slidepp.jpg" alt="Terceiro Slide">
                      </div>
                    </div>
                    <a class="carousel-control-prev" href="#slide" role="button" data-slide="prev">
                      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                      <span class="sr-only">Anterior</span>
                    </a>
                    <a class="carousel-control-next" href="#slide" role="button" data-slide="next">
                      <span class="carousel-control-next-icon" aria-hidden="true"></span>
                      <span class="sr-only">Próximo</span>
                    </a>
                  </div>
            </div>
            </div>
    </div>

    
    <p></p>
    <div class="card" style="background-color: indigo; width: 20rem; left: 36%; right: 40%; border-radius: 50px 50px 50px 50px;" >
    <h2 style="color: ivory; font-weight:bolder;" >Destaques</h2>
    </div>
    <p></p>
    <div class = "container" style="height: auto;">
        <div class="row">
            <div class="col-4">
                <div class="card" style="width: 18rem;height: 40rem;">
                    <img class="card-img-top" src="../assets/rosanegra.jpg" alt="Card image cap" height="400px">
                    <div class="card-body" style="background-color:ivory">
                      <h5 class="card-title">Rosa Negra</h5>
                      <p class="card-text">Autor: Lucas Lima</p>
                      <p class="card-text">Genero: Fantasia</p>
                      <p class="card-text">Capítulos Dispiníveis: 5</p>
                      <a href="#" class="btn btn-primary"> Ver detalhes! </a>
                    </div>
                  </div>
            </div>
            <div class="col-4">
              <div class="card" style="width: 18rem;height: 40rem;">
                  <img class="card-img-top" src="../assets/coraline.jpg" alt="Card image cap" height="400px">
                  <div class="card-body" style="background-color:ivory">
                    <h5 class="card-title">Coraline</h5>
                    <p class="card-text">Autor: Neil Gaiman</p>
                    <p class="card-text">Genero: Fantasia</p>
                    <p class="card-text">Capítulos Dispiníveis: 5</p>
                    <a href="#" class="btn btn-primary"> Ver detalhes! </a>
                  </div>
                </div>
          </div>
          <div class="col-4">
            <div class="card" style="width: 18rem; height: 40rem;">
                <img class="card-img-top" src="../assets/jogos.jpg" alt="Card image cap" height="400px">
                <div class="card-body" style="background-color:ivory">
                  <h5 class="card-title">Jogos Vorazes</h5>
                  <p class="card-text">Autor: Suzanne Colins</p>
                  <p class="card-text">Genero: Aventura</p>
                  <p class="card-text">Capítulos Dispiníveis: 10</p>
                  <a href="#" class="btn btn-primary"> Ver detalhes! </a>
                </div>
              </div>
        </div>
        <div class="col-4">
          <p></p>
          <div class="card" style="width: 18rem; height: 40rem;">
              <img class="card-img-top" src="../assets/Dom.jpg" alt="Card image cap" height="400px">
              <div class="card-body" style="background-color:ivory">
                <h5 class="card-title">Dom Casmurro</h5>
                <p class="card-text">Autor: Machado de Assis</p>
                <p class="card-text">Genero: Romance</p>
                <p class="card-text">Capítulos Dispiníveis: Completo</p>
                <a href="#" class="btn btn-primary"> Ver detalhes! </a>
              </div>
            </div>
      </div>
      <div class="col-4">
        <p></p>
        <div class="card" style="width: 18rem; height: 40rem;">
            <img class="card-img-top" src="../assets/mochileiro.png" alt="Card image cap" height="400px">
            <div class="card-body" style="background-color:ivory">
              <h5 class="card-title">Guia do Mochileiro das Galaxias</h5>
              <p class="card-text">Autor: Douglas Adams</p>
              <p class="card-text">Genero: Aventura</p>
              <p class="card-text">Capítulos Dispiníveis: 15</p>
              <a href="#" class="btn btn-primary"> Ver detalhes! </a>
            </div>
          </div>
    </div>
    <div class="col-4">
      <p></p>
      <div class="card" style="width: 18rem; height: 40rem;">
          <img class="card-img-top" src="../assets/menina.jpg" alt="Card image cap" height="400px">
          <div class="card-body" style="background-color:ivory">
            <h5 class="card-title">A Menina Que Roubava Livros</h5>
            <p class="card-text">Autor: Markus Zusak</p>
            <p class="card-text">Genero: Histórico</p>
            <p class="card-text">Capítulos Dispiníveis: 15</p>
            <a href="#" class="btn btn-primary"> Ver detalhes! </a>
          </div>
        </div>
  </div>
        </div>
      
        <p></p>
      
        <div id="mid">
          <button type="button" class="btn btn-dark" style="text-align: center; text-size-adjust: 15px;">Mais livros</button>
      </div>
    </div>

</div>
</template>

<script>

export default {
  name: 'Home'
}
</script>

<style>
   #mid{
            position: absolute;
            left: 45%;
            right: 50%;
            height: 100px;
            width: 100px;
          }

.home{
    
    background-color:rgb(54, 5, 99);
    background-blend-mode: hard-light;
}

*{margin: 0; padding: 0; box-sizing: border-box;}
.center{
 max-width: 1100px;
 margin: 0 150;
 padding: 0 2%;

}

ul{
height: 100px;

}

header{

    padding: 9px 0;
    text-align: center;
    background:transparent;
}

header li{
    display: inline-block;
    margin: 0 10px;

}
header a{

    text-decoration: none;
    color: ivory;
    
}

.home{
    margin: 0;
    padding: 0;
    font-family: sans-serif;
}

.container{
    background-color: transparent;
    background-blend-mode: hard-light;
   
}

.card{
    text-align: center;
    
}

.carousel-item {
    height: 50vh;
    min-height: 350px;
    background: no-repeat center center scroll;
    -webkit-background-size: cover;
    -moz-background-size: cover;
    -o-background-size: cover;
    background-size: cover;
  }

</style>
