import React from "react"
 

function invalidCredintial(props){
    if(props.credintal){
        return <div>Invalid Credtintal </div>
    }
    else {
        return null;
    }

}
export default invalidCredintial