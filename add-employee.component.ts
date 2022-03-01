import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {
 user:User=new User("","","",0);
  constructor(private userservice:UserService) { }

  ngOnInit(): void {
  }
  createEmployee():void{
    this.userservice.createEmployee(this.user)
    .subscribe(data=>{
      alert("Employee created succesfully.");
    })
  }

}
