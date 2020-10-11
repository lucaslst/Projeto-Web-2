<template>
  <div class="cadastrous">
   
    <div class="container-fluid">
    <div class="row">
    <form class="text-center border border-light p-5" action="#!" style="background-color: indigo; ">
        <img src="../assets/c.png" alt="error" height="110" width="350" >
        <div class="col">
        <input type="text" id="user" class="form-control " placeholder="Usuário" v-model="usuario"><br>
        <input type="email" id="email" class="form-control mb-4" placeholder="E-mail" v-model="email">
        <input type="text" id="nascimento" class="form-control mb-4" placeholder="Data de nascimento" v-model="datanascimento">
        <input type="password" id="senha" class="form-control mb-4" placeholder="Senha" v-model="senha">
        <input type="password" id="confirmasenha" class="form-control mb-4" placeholder="Confirmar Senha" v-model="confirmasenha">
        
        </div>
        
        <button class="btn btn-info my-4 btn-block" type="submit" @click="salvar" > Confirmar </button>
        
    </form>
    </div>
    </div>
  </div>
</template>

<script>

export default {
 data: function() {
    return {
      usuario: "",
      email: "",
      datanascimento: "",
      senha: "",
      confirmasenha: "",
      baseURI: "http://localhost:2000/lergustar/api/usuarios",
    };
  },
  methods: {
    salvar: function() {
      let obj = {
        usuario: this.usuario,
        email: this.email,
        datanascimento: this.datanascimento,
        senha: this.senha
      };
      if(this.usuario.length == 0 || this.email.length == 0 || datanascimento.length == 0 || this.senha.length == 0 || this.confirmasenha.length == 0 ){
        alert("preencher todos os campos!");
      }
      if (this.usuario.length < 5) {
        alert("Nome de usuario muito curto! Por favor, insira um nome maior que 5 letras!");
      }
      if(this.email) 
      if (this.senha.length < 8) {
        alert("Senha muito curta! Por favor, digite uma senha de no mínimo 8 digitos");
      }
      if (this.senha != this.confirmasenha) {
        alert("Senhas nao correspondem!");
      }
      else{
      this.$http.post(this.baseURI, obj).then((result) => {
        if (result.data != "") {
          this.$router.push({ name: 'Home'});
        } 
      });
    }
 },
 },
};
</script>

<style>

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

button[type="submit"] {
    border: 0;
    background: white;
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

button[type="submit"]:hover {
    background: #2ecc71
}

.forgot {
    text-decoration: underline
}
</style>