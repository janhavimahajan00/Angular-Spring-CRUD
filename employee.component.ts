import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user.service';
import { User } from '../user';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
 users: User[];
  constructor(private userservice:UserService) { }

  ngOnInit(): void {
    this.userservice.getEmployeesList().subscribe((data:User[])=>{
      console.log(data);
      this.users=data;
    });
    }
    deleteEmployee(user: User): void {
      this.userservice.deleteEmployee(user)
        .subscribe( data => {
          this.users = this.users.filter(u => u !== user);
        })
    };
  }


