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
    this.service.findById(this.emp.empNo).subscribe((data) => {
      this.emp = data;
      this.flag = true;
    });
  }
}
