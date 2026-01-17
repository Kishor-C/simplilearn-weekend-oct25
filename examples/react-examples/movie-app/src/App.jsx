import axios from 'axios';
import { useEffect, useState } from 'react'

function MovieSearch() {
  // this stores all the movies
  let [movies, setMovies] = useState([]);
  let [title, setTitle] = useState("");
  let [filter, setFilter] = useState([]);
  let url = "http://localhost:3000/movies";
  // useEffect automatically invokes the arrow function when the component loads/state chages
  // the 2nd parameter is list of states that makes useEffect to invoke arrow function when they change
  useEffect(()=>{
    axios.get(url).then((res) => setMovies(res.data));
  }, [])
  // search by title
  let handleSearch = (e) => {
    let result = movies.filter((movie)=>movie.title == title)
    //let result = movies.filter((movie) => movie.rating <= 4);
    setFilter(result);
  }
  return (<div>
    <input type = "text" className = "form-control form-control-lg w-25" 
      onChange = {e => setTitle(e.target.value)}></input> <br />
    <button className="btn btn-lg btn-primary" onClick = {handleSearch}>Search</button>
   
    {
      filter.map((movie, index)=>
      <p key = {movie.id}>{index + 1}. Title = {movie.title}, Year = {movie.year}, Rating = {movie.rating}</p>)
    }
  </div>)
}

function App() {
  return (
    <div className="container-fluid">
      <h1>Movie Search</h1>
      <MovieSearch />
    </div>
  )
}

export default App
