import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import {TodoserviceService} from '../../Service/todoservice.service';
import {Todo} from '../../Model/Todo';

@Component({
  selector: 'app-create-todo',
  templateUrl: './create-todo.component.html',
  styleUrls: ['./create-todo.component.css']
})
export class CreateTodoComponent implements OnInit {

  form:FormGroup;
  submitted=false;
  loading=false;
  UserTodo:Todo;
  constructor(
    private formBulider:FormBuilder,
    private TodoService: TodoserviceService
  ) { }

  ngOnInit(): void {
    this.form=this.formBulider.group({
      title:['',Validators.required],
      description:['',Validators.required]
    })
   
  }
  get validation(){
    return this.form.controls;
  }
 
  onSubmit() {
    this.submitted=true;
    this.UserTodo=this.form.value;
    this.UserTodo.status=true;
    const user=sessionStorage.getItem("user");
    var temp=JSON.parse(user);
    const userId=temp.userId;
    console.log("Userid of registerd "+userId);
    this.UserTodo.userId=parseInt(userId);
    console.log("this is after setting"+this.UserTodo.userId);
    this.TodoService.addTodo(this.UserTodo).subscribe(Response=>{
      console.log(Response);
    })
    console.log("in submit")
  }

}
