import { Component } from "react";
import User from "../user"
import UserService from "../user-service";

export default class Register extends Component {
  constructor(props) {
    super(props);
    this.service = new UserService();
    this.user = new User();
    this.state = {
      user: this.user,
    };
  }

  handleInput = (event) => {
    this.setState({
      user: {
        ...this.state.user,
        [event.target.name]: event.target.value,
      },
    });
  };


  onRegister() {
    this.service.persist(this.user);
    // this.props.history.push("/login");
  }

  render() {
    return (
      <form onSubmit={this.onRegister}>
        <label>Name</label>
        <input 
          type="text"
          name="name"
          value={this.state.user.name}
          onChange={this.handleInput}
        />
        <br />
        <label>Email</label>
        <input
          type="text"
          name="email"
          value={this.state.user.email}
          onChange={this.handleInput}
        />
        <br />
        <label>Password</label>
        <input
          type="password"
          name="password"
          value={this.state.user.password}
          onChange={this.handleInput}
        />
        <br />
        <button type="submit">Register</button>
      </form>
    );
  }
}
