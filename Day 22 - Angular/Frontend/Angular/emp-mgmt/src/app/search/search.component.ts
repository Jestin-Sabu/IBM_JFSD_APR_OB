import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/employee.model';
import { EmployeeService } from '../services/employee.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css'],
})
export class SearchComponent implements OnInit {
  emp: Employee = new Employee();
  flag: boolean = false;
  constructor(private service: EmployeeService) {}

  ngOnInit(): void {}

  findEmployee() {
    var temp = this.service.findById(this.emp.empno);
    if (temp != null) {
      this.emp = temp;
      this.flag = true;
    }
  }
}
