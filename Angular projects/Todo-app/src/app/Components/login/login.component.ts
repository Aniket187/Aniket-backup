import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
 import{ StudentserviceService} from '../../Service/studentservice.service'
import { error } from '@angular/compiler/src/util';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  form: FormGroup;
  loading = false;
  submitted = false;
  returnUrl: string;

  constructor(
      private formBuilder: FormBuilder,
      private accountService: StudentserviceService,
   
  ) { }

  ngOnInit() {
      this.form = this.formBuilder.group({
          email: ['', Validators.required],
          password: ['', Validators.required]
      });
  }


  get reg() { 
     
      return this.form.controls; }

  onSubmit() {
    //console.log(this.reg.email.errors.required);
      this.submitted = true;
    
      if (this.form.invalid) {
          return;
      }

      this.loading = true;
      this.accountService.loginuser(this.form.value)
          .subscribe(data=>{
              console.log(data)
              sessionStorage.setItem("user",JSON.stringify(data));
              this.loading=false;
          },error=>{
              console.log(error.error)
              window.confirm("please enter proper username and password")
          });
  }
}
