import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpErrorResponse, HttpHeaders } from '@angular/common/http';
import { User } from '../user';
@Injectable({ providedIn: 'root' })
export class UserService {
  private url= "http://localhost:8080/employees";
    constructor(private http: HttpClient) { }
    //  public register(user: any){
    //      return this.http.post("http://localhost:8080/",user);
    //  }
    
    getEmployeesList(): Observable<User[]> {
        return this.http.get<User[]>('http://localhost:8080/employees');
    }
    // addEmployee(employee:User):Observable<Object>{
       
    //     return this.http.post(`${this.url}`,employee);

    // }
    // updateEmployee(id:number,employee:User): Observable<Object>{
    //     return this.http.put(`${this.url}/${id}`,employee);
    // }
    createEmployee(employee:User){
        return this.http.post<User[]>("http://localhost:8080/employees", employee);
    }
    deleteEmployee(user:User): Observable<Object>{
        return this.http.delete("http://localhost:8080/employees" +"/"+ user.id);
    }
}