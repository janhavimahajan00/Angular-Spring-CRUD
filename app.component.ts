import { Component } from '@angular/core';
import { UserService } from './services/user.service';
import {  OnInit } from '@angular/core';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
  
export class AppComponent  {
 
  // title = 'http';
  // word:any;
  constructor(private userService: UserService) {
   
    // let hello$ = userService.getEmployeesList();

    //     hello$.subscribe(
    //         (data: any) => this.word=data,
    //         err => console.error(err)
    //     );
    }

}

