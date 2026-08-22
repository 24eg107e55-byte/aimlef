import {BrowserRouter,Routes,Route} from "react-router-dom";
import State from "./components/State";
function App() {
  return (
    <>
      <BrowserRouter>
      <Routes>
        <Route path="/apple" element={<State/>}/>
      </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
