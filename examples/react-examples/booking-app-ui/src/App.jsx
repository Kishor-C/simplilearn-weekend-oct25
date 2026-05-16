import axios from "axios";
import { useState } from "react";

function App() {
  // name, source, destination, distance, type
  let [name, setName] = useState("");
  let [source, setSource] = useState("");
  let [destination, setDestination] = useState("");
  let [distance, setDistance] = useState("");
  let [type, setType] = useState("");

  let handleSubmit = (e) => {
    e.preventDefault();
    // below code creates property with the same name like
    // {"name":name, "source":source} and so on
    let data = { name, source, destination, distance, type };
    axios
      .post("http://localhost:9090/booking", data)
      .then((response) => alert(JSON.stringify(response.data)))
      .catch((err) => alert(err));
  };
  return (
    <div>
      <h2>Booking App</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          placeholder="Enter name"
          onChange={(e) => setName(e.target.value)}
        ></input>
        <br />
        <input
          type="text"
          placeholder="Enter source"
          onChange={(e) => setSource(e.target.value)}
        ></input>
        <br />
        <input
          type="text"
          placeholder="Enter destination"
          onChange={(e) => setDestination(e.target.value)}
        ></input>
        <br />
        <input
          type="text"
          placeholder="Enter distance"
          onChange={(e) => setDistance(e.target.value)}
        ></input>
        <br />
        Select type:
        <select onChange={(e) => setType(e.target.value)}>
          <option value="regular">Regular</option>
          <option value="premium">Premium</option>
          <option value="luxury">Luxury</option>
        </select>
        <br />
        <input type="submit" value="Book"></input>
      </form>
    </div>
  );
}

export default App;
