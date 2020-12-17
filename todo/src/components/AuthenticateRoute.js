import React, { Component } from 'react'
import {Route, Redirect} from "react-router-dom"
import Authenticationservice from './Authenticationservice'


class AuthenticatRoute extends Component{
    constructor(props){
        super(props)
    }
    render(){
        if(Authenticationservice.islogined()){
          
            return <Route {...this.props}/>
        }
        else{
            return<Redirect to="/Login"/>
        }
    }
}
export default AuthenticatRoute;