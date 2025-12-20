import logo from './logo.svg';
import './App.css';


function Hello() {
  return (
    <div>
      <h2>Hello component</h2>
    </div>
  )
}

function App() {
  return (
    <div>
      <h1>React Application</h1>
      <Hello />
      <Hello />
    </div>
  );
}

export default App;

