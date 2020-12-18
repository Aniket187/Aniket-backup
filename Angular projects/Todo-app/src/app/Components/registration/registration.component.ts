import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import{ StudentserviceService} from '../../Service/studentservice.service'
import { error } from '@angular/compiler/src/util';
import{ Student} from '../../Model/Student';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  registerForm: FormGroup;
  loading = false;
  submitted = false;
  user:Student;

  constructor(
      private formBuilder: FormBuilder,
      private router: Router,
      private userService: StudentserviceService,
    
  ) {
    //   // redirect to home if already logged in
    //   if (this.authenticationService.currentUserValue) {
    //       this.router.navigate(['/']);
    //   }
  }

  ngOnInit() {
      this.registerForm = this.formBuilder.group({
          name: ['', Validators.required],
          email: ['', Validators.required],
          password: ['', [Validators.required, Validators.minLength(6)]]
      });
  }

 
  get reg() { return this.registerForm.controls }

  onSubmit() {
      this.submitted = true;
      if (this.registerForm.invalid) {
        return;
    }
     this.user=this.registerForm.value;
     this.user.active=true;
     this.user.role="USER";
     console.log(this.user);
      //console.log(this.registerForm.value);
      
      this.loading = true;
      this.userService.adduser(this.user).subscribe(data=>{
        console.log(data);
      },error=>{
        console.log(error);
      });
      this.loading=true;
  }
}
