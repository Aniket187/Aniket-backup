import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {LoginComponent} from '../app/Components/login/index';
import {RegistrationComponent} from '../app/Components/registration/registration.component';
import {CreateTodoComponent} from '../app/Components/create-todo/create-todo.component'

const routes: Routes = [
  { path: 'Login', component: LoginComponent },
  {path:'Registration' ,component:RegistrationComponent},
  {path:'Create', component:CreateTodoComponent}
]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
