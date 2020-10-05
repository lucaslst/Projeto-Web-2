<template>
  <div class="cadastrousuario">
    <body background="../assets/loginb.jpg"></body>
    <div class="container-fluid">
    <div class="row">
    <form class="text-center border border-light p-5" action="#!" style="background-color: indigo; ">
        <img src="../assets/c.png" alt="error" height="110" width="350" >
        <div class="col">
        <input type="text" id="user" class="form-control " placeholder="Usuário"><br>
        <input type="email" id="email" class="form-control mb-4" placeholder="E-mail">
        <input type="date" id="nascimento" class="form-control mb-4" placeholder="Data de nascimento">
        <input type="password" id="senha" class="form-control mb-4" placeholder="Senha">
        <input type="password" id="confirmasenha" class="form-control mb-4" placeholder="Confirmar Senha">
        
        </div>
        
        <button class="btn btn-info my-4 btn-block" type="submit" > Confirmar </button>
        
    </form>
    </div>
    </div>
  </div>
</template>

<script>

export default {
  name: 'Cadastrousuario'
  
}
</script>

<style>
.cadastrousuario{
    background-color:rgb(54, 5, 99);
    background-blend-mode: hard-light;
}

.cadastrousuario{
    margin: 0;
    padding: 0;
    font-family: sans-serif;
}

form{
    width: 500px;
    padding: 40px;
    left: 430px;
    position: absolute;
    background: white;
    text-align: center;
    transition: 0.25s;
    margin-top: 100px;
    border-radius: 50px 50px 50px 50px;
    -moz-border-radius: 50px 50px 50px 50px;
    -webkit-border-radius: 50px 50px 50px 50px;
    border-color: #2ecc71; 
    border-width: 5px;
    
}
</style>