import React, { Component } from "react"
import { Link, withRouter } from "react-router-dom";
import Authenticationservice from "./Authenticationservice";

class Headers extends Component{
    constructor(){
        super()
        this.state={isuserlogin:"false"}

}
render(){
    const isuserlogined=Authenticationservice.islogined();
    console.log(isuserlogined);

return(<>
   
    <header>
        <nav className="navbar navbar-expand-md navbar-dark bg-dark">
            <div className="navbar-brand">ToDoApp Cyabge </div>
            <ul className="navbar-nav">
               {isuserlogined&&<li><Link  className="nav-link" to="/Welcome/Aniket">Home</Link></li>}
               {isuserlogined&&<li><Link  className="nav-link" to="/todolist">Todolist</Link></li>}
            </ul>

            <ul className="navbar-nav navbar-collapse justify-content-end">
            {!isuserlogined&&<li><Link  className="nav-link" to="/Login">Login</Link></li>}
           { isuserlogined&&<li><Link  className="nav-link" to="/Logout" onClick={Authenticationservice.logoutuser}>Logout</Link></li>}
            </ul>
        </nav>
    </header>


 
 
    </>)
}
}
export default withRouter(Headers);