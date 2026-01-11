import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import { User, UserForm } from './components/Users'
import axios from 'axios'

function FakeUsers() {
  let url = 'https://jsonplaceholder.typicode.com/users';
  let [users, setUsers] = useState([]); // default has empty array
  let [id, setId] = useState("");
  let [message, setMessage] = useState("");
  let [err, setErr] = useState("");
  // handleClick sends HTTP requests to the JSON placeholder using axios
  let handleClick = (e) => {

    // fetch a single user 
    let url2 = `${url}/${id}`
    axios.get(url2).then(response => {
      let data = response.data;
      setMessage(`Hello ${data.name}, your email is ${data.email}`);
      setErr('');
    })
    .catch(err => {setErr('Sorry user '+id+' not found'); setMessage('')})

    // fetches all the users
    axios.get(url).then(response => {setUsers(response.data)})
    .catch(err => console.log(err))
  }
  return (<div>
    <input type = "number" className = 'form-control form-control-lg w-25' 
      onChange = {e=>setId(e.target.value)}></input> <br />
    <button onClick = {handleClick} className = 'btn btn-primary btn-lg'>Search</button> <br /><br />
    <div className='text-success'>{message}</div>
    <div className='text-danger'>{err}</div>

    <button onClick = {handleClick} className = 'btn btn-primary btn-lg'>
      Load Users
    </button>
    <div>
      <table className = 'table'>
        <thead>
          <tr>
            <th>Id</th><th>Name</th><th>Username</th><th>Email</th>
          </tr>
        </thead>
        <tbody>
          {
            users.map((user, index)=><tr key={user.id}>
            <td>{user.id}</td><td>{user.name}</td><td>{user.username}</td><td>{user.email}</td>
          </tr>)}
        </tbody>
      </table>
    </div>
  </div>)
}


 function Form() {
    let [id, setId] = useState("");
    let [name, setName] = useState("");
    let url = 'http://localhost:3000/users'
    let handleSubmit = (e) => {
        // prevents the page refresh
        e.preventDefault();
        axios.post(url, {"id":id, "name":name}).then(res=>alert('Data stored'))
        .catch(err=>alert("error occured"))
    }
   
    return (<div className = 'container-fluid'>
        <h2>User Form</h2>
        <form onSubmit={handleSubmit}>
            Enter id 
            <input type = "text" name = "un" autoComplete="off" onChange = {e=>setId(e.target.value)}
            className='form-control form-control-lg w-25'/> <br />
            Enter Name 
                <input type = "text" name = "ph" autoComplete="off" onChange = {e=>setName(e.target.value)}
                 className='form-control form-control-lg w-25'/> <br />
            <input type = "submit" value = "Register" className = 'btn btn-primary btn-lg w-25'/>
        </form>
    </div>)
}

function App() {
  return (<div>
    <h1 className = 'text-center'>App Component</h1>
    <Form />
  </div>)  
}

export default App
