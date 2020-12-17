import React, { Component } from 'react';
import Invalidcredintal from "./invalidcred";
import Loginmsg from "./loginSuccessful"
import Authenticationservice from './Authenticationservice';


export default class LoginComponent extends Component{
    constructor(props)
    {
        super(props)
        this.state={
            Username:"",
            Password:"",
            loginsuccess:false,
            invalidcredtintal:false
        }
    }


    changehandler=(event)=>{
      
        this.setState({
        [event.target.name]:event.target.value
    })
   }
 

    login=()=>{
        if(this.state.Username==="Aniket"&&this.state.Password==="bhosale")
        {
            Authenticationservice.registeruser(this.state.Username,this.state.Password);
            this.props.history.push(`/Welcome/${this.state.Username}`)
         
            // this.setState({
            //     loginsuccess :true,
            // })
            // this.setState({
            //     invalidcredtintal:false
            // })  
        }
        else{
            this.setState({
                loginsuccess:false,invalidcredtintal:true
            })
        }
    }
    render(){
        return(
          
        <>
        
        {this.state.invalidcredtintal&&<div>invalid credintial</div>}
        {this.state.loginsuccess&&<div>Login successful</div>}
    {    /*
            here we have made seperate functional component fro login message and invalid msg 
            but a simple "&&" operator can get the job done as above
            <Loginmsg login ={this.state.loginsuccess}/>
            <Invalidcredintal credintal={this.state.invalidcredtintal}/>
    */}
            <input type="text" placeholder="Username" name= "Username" value={this.state.Username}  onChange={this.changehandler}/>
            <input type="password" placeholder="Password" name= "Password"  value={this.state.Password} onChange={this.changehandler}/>
            <button onClick={this.login}>Login</button>
        </>
        )
    }

}