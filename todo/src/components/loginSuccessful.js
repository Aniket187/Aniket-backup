import React from "react"

function loginsuccess(props){
    if(props.login){
        return <div>Login Successfull</div>
    }
    else{
        return null;
    }
}

export default loginsuccess