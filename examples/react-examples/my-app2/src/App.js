import logo from './logo.svg';
import './App.css';
import Hello from './components/Hello';
import GreetComponent from './components/Greet';
import Users from './components/Users';

function App() {
  let userName = "Alex";
  let userAge = 35;
  let obj = {id : 200, name : "Raj", phone : 93482393};

  // nested object
  let comment = {
    profile : {name : "Mark", dob: "1999-12-20", imageURL : "take-some-google-image-address"},
    text : "Hello i am mark zukerberg", likes : "20"

  }
  // pass this comment to Comment component, which displays text & likes but passes profile to another component
  // that displays profile name, dob and profile image
  // ex: You must have Comment, Profile components, where Comment component renders Profile component as a child component
  return (
    <div>
      <h1>React Application</h1>
      <Users />
    </div>
  );
}

export default App;

