import { Injectable, Type } from '@angular/core';
import {HttpClient,HttpHeaders} from '@angular/common/http';
import {Student } from '../Model/Student';
import {Observable} from 'rxjs';

const httpOption={
  headers :new HttpHeaders({
    'Content-Type':'application/json'
  })
}
@Injectable({
  providedIn: 'root'
})
export class StudentserviceService {
  studenturl:string='http://localhost:8080/student';
   Loginurl:string="http://localhost:8080/login";


  constructor(private http :HttpClient) { }

adduser(student:Student):Observable<Student>{
  return this.http.post<Student>(this.studenturl,student)
}
loginuser(student:Student):Observable<Student>{
  return this.http.post<Student>(this.Loginurl,student)
}

}
