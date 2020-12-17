import React, { Component } from 'react'
import moment from "moment";
import {Formik,Form, Field, ErrorMessage} from "formik";
import Authenticationservice from "./Authenticationservice"
import Tododataservice from "../API/tododataservice"
import tododataservice from '../API/tododataservice';

export default class updatecomp extends Component{
    constructor(props)
    {
        super(props);
        this.state={
            id:this.props.match.params.id,
            description:"",
            targetdate: moment(new Date()).format('YYYY-MM-DD')

        }
        console.log(moment(new Date()).format('YYYY-MM-DD'))
    }
    submit=(value)=>{
        console.log(value);

        if(this.state.id ===-1){
            let username=Authenticationservice.username();
        Tododataservice.create(username,this.state.id,{id:this.state.id,description:value.description,targetdate:value.targetdate})
        .then(()=>{this.props.history.push("/todolist")})

        }
        else{
        let username=Authenticationservice.username();
        Tododataservice.UPDATE(username,this.state.id,{id:this.state.id,description:value.description,targetdate:value.targetdate})
        .then(()=>{this.props.history.push("/todolist")})
        }



    }
    validate=(value)=>{
      
        let error={};
        if(!value.description)
        {error.description="enter the description";
        }
        else if(value.description.length<5)
        {error .description="atleast enter 5 character"}
        if(!moment(value.targetdate).isValid())
        {
            error.targetdate="enter proper date"
        }
        return error;
        
    }


    componentDidMount(){  

        if(this.state.id===-1)
        {
            return
        }
        let username=Authenticationservice.username();
        Tododataservice.singletodo(username ,this.state.id).then(Response=>{
            this.setState({description:Response.data.description,targetdate:moment(Response.data.targetdate)
                .format('YYYY-MM-DD')
            }
            )
            
        })

      
    }

    render(){
        let {description,targetdate}=this.state;
        return(
            <>
            <h1>
                Todo
            </h1>
            <div className='container'>
          <Formik initialValues={{description,targetdate}} onSubmit={this.submit} validate={this.validate} enableReinitialize="true">
              {
                  (props)=>(
                      <Form>
                          <ErrorMessage name="description"  component ="div" className=" alert alert-warning"/>
                          <fieldset>
                              <label>Description</label>
                              <Field className="form-control" type="text" name="description"/>                         
                          </fieldset>
                          <ErrorMessage name="targetdate"  component ="div" className=" alert alert-warning"/>

                          <fieldset>
                              <label>Targetdate</label>
                              <Field className="form-control" type="date" name="targetdate"/>                         
                          </fieldset>
                          <button className="btn-success"> save</button>
                          </Form>
                      
                  )
              }
              </Formik>
                </div>
            </>
        );
    }
}