import { Component } from "react";
import FlightDetails from "./FlightDetails";
import AddFlight from "./AddFlight";
import FlightService from "../services/FlightService";

export default class ListFlight extends Component {
  constructor(props) {
    super(props);
    this.service = new FlightService();
    this.state = {
      flights: [],
      showDetails: false,
      newFlight: false,
      selectedFlight: "",
    };
  }

  componentDidMount() {
    this.getFlights();
    }

  getFlights() {
    this.setState({ flights: this.service.listFlights() });
  }

  clearState() {
    this.setState({
      showDetails: false,
      newFlight: false,
      selectedFlight: "",
    });
  }

  render() {
    if (!this.state.flights) return null;
    const list = this.state.flights.map((f) => (
      <li
        key={f.code}
        onClick={() => this.onSelection(f.code)}
        class="list-group=item"
      >
        {f.code}
      </li>
    ));

    return (
      <div>
        <h1> List of Flights</h1>
        <ul class="list-group">{list}</ul>
        <br />
        <button class="btn btn-info" onClick={() => this.onNewFLight()}>
          Add new Flight
        </button>
        <hr />
        {this.state.showDetails && this.state.selectedFlight && (
          <FlightDetails
            flight={this.state.selectedFlight}
            onDelete={this.onDeleteFlight}
          />
        )}
        {this.state.newFlight && <AddFlight onSubmit={this.onSaveFlight} />}
      </div>
    );
  }
  onSelection = (code) => {
    const f = this.service.flightByCode(code);
    this.setState({ showDetails: true, selectedFlight: f, newFlight: false });
  };

  onNewFLight = () => {
    this.clearState();
    this.setState({ newFlight: true });
  };

  onDeleteFlight = (code) => {
    this.service.deleteFlight(code);
    this.getFlights();
  };

  onSaveFlight = (flight) => {
    this.service.addFlight(flight);
    this.clearState();
    this.getFlights();
  };
}
  