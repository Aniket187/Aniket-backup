import React from 'react';
import logo from './logo.svg';
import './App.css';
import Todo from "./components/TodoApp";
import Welcome from "./components/Welcome";
import Error from "./components/Error";
import Todolist from "./components/todolist";
import Header from "./components/header";
import Footer from "./components/footer";
import Logout from "./components/Logout";
import Authenticateservice from "./components/Authenticationservice"
import AuthenticateRoute from "./components/AuthenticateRoute"
import {BrowserRouter as Router ,Route, Switch} from "react-router-dom"
import Update from "./components/updatecomp"
import 'bootstrap/dist/css/bootstrap.min.css';

function App() {
  return (
 <>
 <Router>
 <Header/>
   <Switch>
  
   <Route path="/"exact component={Todo}/>
   <Route path="/Login" component={Todo}/>
   <AuthenticateRoute path="/Welcome/:name"component={Welcome}/>
   <AuthenticateRoute path="/todos/:id"component={ Update}/>
   <AuthenticateRoute  path="/todolist" component={Todolist}/>
   <AuthenticateRoute path="/Logout" component={Logout}/>
   <Route component={Error}/>
   
</Switch>
<Footer/>
</Router> 
 </>
  );
}

export default App;
