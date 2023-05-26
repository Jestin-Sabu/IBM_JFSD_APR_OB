import { Component, OnInit } from '@angular/core';
import { LoginModel } from 'src/login.model';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent implements OnInit{
  auth: LoginModel = new LoginModel();
  roles: string[] = ['Admin', 'User', 'Guest'];
  flag : boolean = false;

  constructor(){}

  ngOnInit(): void {
    
  }

  validate(){
    if(this.auth.userid == "jestin" && this.auth.password == "java"){
      this.flag = true;
    }
  }
}
