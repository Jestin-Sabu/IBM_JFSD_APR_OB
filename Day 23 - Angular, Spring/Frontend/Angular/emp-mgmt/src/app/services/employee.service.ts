import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employee } from 'src/employee.model';

@Injectable({
  providedIn: 'root',
})
export class EmployeeService {
  private static baseUri = 'http://localhost:8880';
  constructor(private http: HttpClient) {}
  addEmployee(e: Employee) {
    this.http.post(EmployeeService.baseUri + '/employee', e).subscribe(data=>data=e);
  }

  getAll() {
    return this.http.get<Employee[]>(EmployeeService.baseUri + '/employees');
  }

  findById(no: number) {
    return this.http.get<Employee>(EmployeeService.baseUri + '/employee/' + no);
  }

  delEmployee(idx: number) {
    return this.http.delete<Employee[]>(EmployeeService.baseUri + '/employee/' + idx);
  }
}
