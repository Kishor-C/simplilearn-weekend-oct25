function Greet({user}) {
  let {id, name, phone} = user;
  return (<div>
    <h2>Greet component</h2>
    <p>Hello {name}, your id is {id} 
        and phone is {phone}</p>
  </div>)
}

export default Greet;