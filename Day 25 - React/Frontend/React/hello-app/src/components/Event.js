import { Component } from "react";

export default class Event extends Component {
    
    state = { msg: 'Not yet clicked'}

    changeState = () => {
        this.setState({ msg: 'Clicked'})
    }
    
    render(){
        return(
            <div>
                <h1>{ this.state.msg }</h1>
                <button onClick={this.changeState}>Click Me</button>
            </div>
        )
    }
}