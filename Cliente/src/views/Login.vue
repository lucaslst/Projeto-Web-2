<template>
<div class="log">
  <div class="container-fluid">
      <div class="row">
          <div class="col-md-6">
              <div class="card">
                  <form class="box">
                    <img src="../assets/logof.png" alt="Erro" width=410 height=200>
                    <img src="../assets/frase.png" alt="Erro" width=400 height=80>
                      <input type="text" name="" id="elogin" placeholder="Email" v-model="email"> 
                      <input type="password" name="" id="slogin" placeholder="Senha" v-model="senha"> 
                      <a class="forgot text-muted" href="#">Esqueceu a senha?</a> 
                      <p></p>
                      <a class="forgot text-muted" id="cd" @click="cadastrarusuario"  >Cadastrar-se gratuitamente</a>
                      <input type="submit" value="Login" @click="logar">
                  </form>
              </div>
          </div>
      </div>
  </div>
</div>
</template>

<script>
export default {
  name: "Login",
  data() {
    return {
      email: "",
      senha: "",
      baseURI: "http://localhost:2000/lergustar/api/usuarios/login",
    };
  },
  created: function() {
    if(localStorage.getItem("usuario")) {
        this.$router.replace("/home");
    } 
  }, 
  methods: {
    cadastrarusuario() {
     this.$router.push({ name: "Cadastrousuario"}).catch(()=>{});
   },
    logar: function() {
      let obj = {
        email: this.email,
        senha: this.senha,
      };
      if(this.email.length == 0 || this.senha.length == 0){
        alert("preencher todos os campos!");
      }
      if(this.email.length < 5){
        alert("E-Mail inválido!")
      }
      if(this.senha.length < 7){
        alert(" A senha deve ter no minimo 8 digitos")
      }
      else{
        this.$http.post(this.baseURI, obj).then((result) => {
        if (result.data != "") {
          localStorage.setItem("usuario", JSON.stringify(result.data));
        }
      });
      }
    },
  },
};

</script>

<style>

.box {
    width: 500px;
    padding: 0px;
    position: absolute;
    left: 65%;
    background: rgb(255, 255, 255);
    text-align: center;
    transition: 0.25s;
    margin-top: 100px;
    border-radius: 50px 50px 50px 50px;
    -moz-border-radius: 50px 50px 50px 50px;
    -webkit-border-radius: 50px 50px 50px 50px;
    
}

.box input[type="text"],
.box input[type="password"] {
    border: 0;
    background: none;
    display: block;
    margin: 20px auto;
    text-align: center;
    border: 2px solid #3498db;
    padding: 10px 10px;
    width: 250px;
    outline: none;
    color: black;
    border-radius: 24px;
    transition: 0.25s
}

.box h1 {
    color: black;
    text-transform: uppercase;
    font-weight: 500
}

.box input[type="text"]:focus,
.box input[type="password"]:focus {
    width: 300px;
    border-color: #2ecc71
}

.box input[type="submit"] {
    border: 0;
    background: none;
    display: block;
    margin: 20px auto;
    text-align: center;
    border: 2px solid #2ecc71;
    padding: 14px 40px;
    outline: none;
    color: black;
    border-radius: 24px;
    transition: 0.25s;
    cursor: pointer
}

.box input[type="submit"]:hover {
    background: #2ecc71
}

.forgot {
    text-decoration: underline
}

</style>


