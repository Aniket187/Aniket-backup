import React, { Component } from "react"
import Authenticationservice from "./Authenticationservice"
import Tododataservice from "../API/tododataservice"
import tododataservice from "../API/tododataservice"
import moment from "moment";

export default class todolist extends Component{
    constructor(props)
    {
        {console.log(props)}
        super(props)
        this.state={todo:[], message:null
                    }
    }


    refreshtodos=()=>{
        let username=Authenticationservice.username();
        Tododataservice.alltodo(username).then(Response=>{
            console.log(Response);
            this.setState({ todo: Response.data})});
    }
componentDidMount(){
  this.refreshtodos();

}
deleted=(id)=>{
    let username=Authenticationservice.username();
    tododataservice.deletetodo(username,id).then(Response=>{
        this.setState({message:" Todo Id "+id+" is deleted"})
        this.refreshtodos();
    })
     

}

addtodo=()=>{
    console.log();
    this.props.history.push(`/todos/-1`)
}


updatetodo=(id)=>{
    console.log(id);
    this.props.history.push(`/todos/${id}`)
}

    render(){
        return(<div  className="container">
{this.state.message&&<div className="alert alert-success">{this.state.message}</div>}
       <h1>
           Todolist
       </h1>
       <div>
            <table className="table">
                
                <th>ID</th>
                <th>Description</th>
                <th>Targetdate</th>
                <th>IsCompleted ?</th>
                <th>Delete</th>
                <tbody>{this.state.todo.map((todo1)=>(<tr><td>{todo1.id}</td>
                    
                        <td>{todo1.description}</td>
                        <td>{moment(todo1.targetdate).format("YYYY-MM-DD")}</td>
                        <td>{todo1.status.toString()}</td>
                        <td><button  className="btn btn-success"onClick= {()=>this.updatetodo(todo1.id)}>Update</button></td>
                        <td><button  className="btn btn-warning"onClick= {()=>this.deleted(todo1.id)}>Delete</button></td>
                        </tr>))}
                    
                </tbody>
                </table>
                <div className="row">
                    <button className="btn-success" onClick={this.addtodo}>Add todo</button>

                    </div>
        </div>
        </div>)
    }

    
}