import { Component } from "react";

export default class Toggle extends Component {
    state = { toggle: true };

    render(){
        return(
            <button onClick={() => this.setState({ toggle: !this.state.toggle })}>{this.state.toggle?"ON" : "OFF"}</button>
        )
    }
}