import React, { useEffect, useState } from 'react'

function State() {
  let [d, setD] = useState("🍏");
  console.log("\n\t data : " + d);
  function change() {
    if (d == "🍏") {
      setD("🍎");
    } else if (d == "🍎") {
      setD("🍏");
    } 
  }
  useEffect(change,[]);
  return (
    <div>
      <h3>fruit</h3>
      <h1>{d}</h1>
      <button onClick={change}>click</button>
    </div>
  );
}

export default State
