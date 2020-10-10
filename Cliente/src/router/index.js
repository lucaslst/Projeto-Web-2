import Vue from 'vue'
import VueRouter from 'vue-router'
import Login from '../views/Login.vue'
import Home from '../views/Home.vue'
import Cadastrousuario from "../views/Cadastrousuario.vue";

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Login',
    component: Login
  },
  {
    path: '/cadastrousuario',
    name: 'Cadastrousuario',
    component: Cadastrousuario
  },
  {
    path: '/home',
    name: 'Home',
    component: Home
  },
  { path: '*', redirect: '/' } 

]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
