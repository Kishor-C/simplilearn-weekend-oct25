import { useState } from "react"

export function UserForm() {
    let [username, setUsername] = useState("");
    let [phone, setPhone] = useState("");

    let handleSubmit = (e) => {
        // prevents the page refresh
        e.preventDefault();
        alert("Hello "+username+", phone is "+phone);
    }
    let handleInput = (e) => {
        let inputName = e.target.name;
        let inputValue = e.target.value;
        if(inputName == 'un') {
            setUsername(inputValue);
            console.log(inputValue);
        }
        if(inputName == 'ph') {
            setPhone(inputValue);
            console.log(inputValue);
        }
    }
    return (<div className = 'container-fluid'>
        <h2>User Form</h2>
        <form onSubmit={handleSubmit}>
            Enter username 
            <input type = "text" name = "un" autoComplete="off" onChange = {handleInput}
            className='form-control form-control-lg w-25'/> <br />
            Enter phone 
                <input type = "number" name = "ph" autoComplete="off" onChange = {handleInput}
                 className='form-control form-control-lg w-25'/> <br />
            <input type = "submit" value = "Register" className = 'btn btn-primary btn-lg w-25'/>
        </form>
    </div>)
}

export function User(props) {
    // useState(defaultValue)
    let [name, setName] = useState("Guest");
    // event handler - onClick, onChange, onInput, onSubmit
    let handleChange = () => {
        setName(props.name);
    }

    return (<div>
        <h2>Hello {props.name}</h2>
        <h2>Name = {name}</h2>
        <button onClick={handleChange}>Update</button>
    </div>)
}