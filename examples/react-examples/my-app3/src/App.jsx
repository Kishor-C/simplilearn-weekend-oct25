import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import { User, UserForm } from './components/Users'

function App() {
  return (<div>
    <h1>App Component</h1>
    <UserForm />
    <User name = "Alex" />
  </div>)  
}

export default App
