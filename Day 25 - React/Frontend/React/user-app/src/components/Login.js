import { Component } from "react";
import UserService from "../user-service";

export default class Login extends Component {
  constructor(props) {
    super(props);
    this.service = new UserService();
    this.state = {
      email: "",
      password: "",
      user: null,
    };
  }

  onLogin() {
    this.setState({
      user: this.service.authenticate(this.state.email, this.state.password),
    });
    if (this.state.user != null) {
      localStorage.setItem("USER", JSON.stringify(this.state.user));
      this.props.history.push("/dashboard");
    }
  }

  handleInput = (e) => {
    this.setState({ [e.target.name]: e.target.value });
  };
  render() {
    return (
      <form>
        <label>Email</label>
        <input
          type="text"
          name="email"
          value={this.state.email}
          onChange={this.handleInput}
        />
        <br />
        <label>Password</label>
        <input
          type="password"
          name="password"
          value={this.state.password}
          onChange={this.handleInput}
        />
        <button onClick={() => this.onLogin()}>Login</button>
        <br />
      </form>
    );
  }
}
