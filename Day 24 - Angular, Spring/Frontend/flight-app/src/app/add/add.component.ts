import { Component } from '@angular/core';
import { FlightService } from '../services/flight.service';
import { Flight } from "src/models/flight";
import { Router } from '@angular/router';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css'],
})
export class AddComponent {
  flight: Flight = new Flight();
  carriers: string[] = ['Jet', 'Indigo', 'AirIndia', 'Vistara'];
  cities: string[] = [
    'Mumbai',
    'Pune',
    'Goa',
    'Delhi',
    'Bengaluru',
    'Kochi',
    'Kolkata',
  ];
  constructor(private service: FlightService, private router: Router) {}
  ngOnInit(): void {}
  saveFlight() {
    this.service.addFlight(this.flight);
    this.router.navigate(['/list']);
  }
}
