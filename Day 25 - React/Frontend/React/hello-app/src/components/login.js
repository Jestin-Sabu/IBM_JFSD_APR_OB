import { Component } from "react";

export default class Login extends Component {
    state={username: '', password: ''};

    validate = () =>{
        if(this.state.username.length < 4 && this.state.password.length < 4){
            alert("Username and Password must be atleast 4 characters long");
        }
        else if(this.state.username !== 'admin' || this.state.password !== 'admin'){
            alert("Invalid Username or Password");
        }
        else{
            alert("Login Successful");
        }
    }

    render(){
        return(
            <div>
                <form onSubmit={this.validate}>
                    <label>Username</label>
                    <input type="text" value={this.state.username} onChange={(e) => this.setState({ username: e.target.value })} />
                    <br />
                    <label>Password</label>
                    <input type="password" value={this.state.password} onChange={(e) => this.setState({ password: e.target.value })} />
                    <button type="submit">Login</button>
                </form>
                <hr />
                Username: {this.state.username}
                <br />
                Password: {this.state.password}
            </div>
        )
    }
}