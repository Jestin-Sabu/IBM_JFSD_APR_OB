import { useState } from "react";
import UserService from "../user-service";
import { useNavigate } from "react-router-dom";

export default function Login() {
  const service = new UserService();
  const navigate = useNavigate();
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");

  const handleLogin = async (e) => {
    var successful = false;
    e.preventDefault();
    try {
      successful = await service.authenticate(email, password);
      if (successful) {
        console.log("Login successful");
        navigate("/dashboard");
      }
    } catch (error) {
      console.log(error);
    }
  };

  return (
    <form onSubmit={handleLogin} method="POST">
      <label>Email</label>
      <input
        type="text"
        name="email"
        value={email}
        onChange={(e) => setEmail(e.target.value)}
      />
      <br />
      <label>Password</label>
      <input
        type="password"
        name="password"
        value={password}
        onChange={(e) => setPassword(e.target.value)}
      />
      <button type="submit">Login</button>
      <br />
    </form>
  );
}
