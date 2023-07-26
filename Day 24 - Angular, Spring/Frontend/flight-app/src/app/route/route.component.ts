import { Component } from '@angular/core';
import { Flight } from 'src/models/flight';
import { FlightService } from '../services/flight.service';

@Component({
  selector: 'app-route',
  templateUrl: './route.component.html',
  styleUrls: ['./route.component.css'],
})
export class RouteComponent {
  flights: Flight[] = [];
  source: string = '';
  destination: string = '';
  cities: string[] = [
    'Mumbai',
    'Pune',
    'Goa',
    'Delhi',
    'Bengaluru',
    'Kochi',
    'Kolkata',
  ];
  constructor(private service: FlightService) {}

  search() {
    this.service
      .findByRoute(this.source, this.destination)
      .subscribe((data) => (this.flights = data));
  }
}
