function Hello(props) {
  return (
    <div>
      <h2 className='alert alert-primary'>Hello component</h2>
      <p>Username is {props.name} and age is {props.age}</p>
    </div>
  )
}

export default Hello;