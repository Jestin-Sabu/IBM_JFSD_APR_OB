import {BrowserRouter as Router, Routes, Route, Link} from 'react-router-dom';

export default function Routers() {
    return (
        <Router>
            <ul>
                <li><Link to="">Home</Link></li>
                <li><Link to="/about">About</Link></li>
                <li><Link to="/dash">Dashboard</Link></li>
            </ul>
            <hr />
            <div>
                <Routes>
                    <Route exact path="/" element={<Home />}/>
                    <Route path="/about" element={<About />}/>
                    <Route path="/dash" element={<Dashboard />}/>
                </Routes>
            </div>
        </Router>
    );
}

function Home(){
    return <h2>Home</h2>
}

function About(){
    return <h2>About</h2>
}

function Dashboard(){
    return <h2>Dashboard</h2>
}
