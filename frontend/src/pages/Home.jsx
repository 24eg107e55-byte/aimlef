import React from 'react'
import Card from '../components/Card'
import "../style/h.css"
function Home() {
  return (
    <div className="card-container">
      <Card f="apple" v="🍏" />
      <Card f="fruit" v="🍑" />
      <Card f="mango" v="🥭" />
    </div>
  )
}

export default Home
