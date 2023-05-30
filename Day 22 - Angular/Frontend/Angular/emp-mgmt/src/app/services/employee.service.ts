import { Injectable } from '@angular/core';
import { Employee } from 'src/employee.model';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  emps:Employee[] = [];
  constructor() { }
  addEmployee(e:Employee){
    this.emps.push(e);
  }

  getAll(){
    return this.emps;
  }

  findById(no: number){
    return this.emps.find(e=>e.empno == no)
  }

  delEmployee(idx: number){
    return this.emps.splice(idx,1);
  }
}
