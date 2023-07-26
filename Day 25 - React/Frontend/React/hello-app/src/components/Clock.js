import { Component } from "react";

export default class Clock extends Component {
  state = { date: new Date() };

  tick() {
    this.setState({ date: new Date() });
  }

  componentDidMount() {
    this.timer = setInterval(() => this.tick(), 1000);
  }

  componentWillUnmount() {
    clearInterval(this.timer);
  }

  render() {
    return <h2>Now it is {this.state.date.toLocaleDateString()}</h2>;
  }
}
