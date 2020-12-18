import { Injectable } from '@angular/core';
import {HttpClient,HttpHeaders} from '@angular/common/http';
import  {Todo } from '../Model/Todo';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TodoserviceService {
todoUrl:string="http://localhost:8080/Addtodo";
  constructor(private http :HttpClient) { }


  addTodo(todo:Todo):Observable<Todo>{
    return this.http.post<Todo>(this.todoUrl,todo);
  }
}


