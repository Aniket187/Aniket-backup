import React, { Component } from "react"
import { Link } from "react-router-dom"
import Hellowroldservice from "../API/helloworldservice"
import helloworldservice from "../API/helloworldservice"


export default class Welcome extends Component{
    constructor(props)
    {
        super(props)
        this.state={welcome:""};

console.log(props)    }

somemessage=()=>{
    console.log("in some message function");

    helloworldservice.excuteserviice().then(Response=>{this.setState({welcome:Response.data})})
    .catch(error=>{
        alert(error.response.data.message)})
}
    render(){
        return(<><div>
            Welcome {this.props.match.params.name} you can manage your Todo List here<Link to="/todolist">Click</Link>
            </div>
            <div className="container">
                click here 
                <button className ="btn btn-success" onClick={this.somemessage}>click here</button>
                <div>
                    {this.state.welcome}
                    </div>

            </div>
            </>)
    }
}