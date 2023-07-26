import { Component } from "react";
import UserService from "../user-service";

export default class Dashboard extends Component {
  constructor(props) {
    super(props);
    this.state = {
      users: [],
      movies: [],
      screens: [],
    };
    this.service = new UserService();
  }

  componentDidMount() {
    this.service.listUsers().then((data) => {
      this.setState({ users: data });
    });
    this.service.getMovies().then((data) => {
      this.setState({ movies: data });
    });
    this.service.getScreens().then((data) => {
      this.setState({ screens: data });
    });
  }

  render() {
    const { users, movies } = this.state;
    console.log(movies);
    if (users.length == null || movies.length == null)
      return <div>Loading...</div>;
    return (
      <div>
        <h1>Dashboard</h1>
        <h2>Admins</h2>
        <table border="2">
          <thead>
            <tr>
              <th>Name</th>
              <th>Email</th>
            </tr>
          </thead>
          <tbody>
            {users.map((user) => (
              <tr key={user.id}>
                <td>{user.name}</td>
                <td>{user.email}</td>
              </tr>
            ))}
          </tbody>
        </table>
        <hr />
        <h2>Movies</h2>
        <table border="2">
          <thead>
            <tr>
              <th>Id</th>
              <th>Title</th>
              <th>Genre</th>
              <th>Rating</th>
              <th>Release Date</th>
              <th>Duration</th>
              <th>Director</th>
              <th>Cast</th>
            </tr>
          </thead>
          <tbody>
            {movies.map((movie) => (
              <tr key={movie.id}>
                <td>{movie.id}</td>
                <td>{movie.name}</td>
                <td>{movie.genre}</td>
                <td>{movie.rating}</td>
                <td>{movie.releaseDate}</td>
                <td>{movie.duration}</td>
                <td>{movie.director}</td>
                <td>{movie.cast}</td>
              </tr>
            ))}
          </tbody>
        </table>
        <hr />
        <h2>Screens</h2>
        <table border="2">
          <thead>
            <tr>
              <th>Id</th>
              <th>Name</th>
              <th>Total Seats</th>
              <th>Normal Seats</th>
              <th>Premium Seats</th>
              <th>Executive Seats</th>
            </tr>
          </thead>
          <tbody>
            {this.state.screens.map((screen) => (
              <tr key={screen.id}>
                <td>{screen.id}</td>
                <td>{screen.name}</td>
                <td>{screen.totalSeats}</td>
                <td>{screen.normalSeats}</td>
                <td>{screen.premiumSeats}</td>
                <td>{screen.executiveSeats}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    );
  }
}
