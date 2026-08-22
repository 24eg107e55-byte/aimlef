import {BrowserRouter,Routes,Route} from "react-router-dom";
import State from "./components/State";
import Loader from "./components/Loader";
import Card from "./components/Card";
import Home from "./pages/Home";
function App() {
  return (
    <>
      <BrowserRouter>
      <Routes>
        <Route path="/apple" element={<State/>}/>
        <Route path="/l" element={<Loader/>}/>
        <Route path="/c" element={<Card/>}/>
        <Route path="/home" element={<Home/>}/>
      </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
