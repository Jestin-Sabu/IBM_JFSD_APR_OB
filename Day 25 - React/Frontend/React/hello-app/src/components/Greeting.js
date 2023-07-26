const Greeting = (props) => {
    return(
        <h2>Happy Holidays from {props.from || 'Santa'}</h2>
    )
}

export default Greeting;