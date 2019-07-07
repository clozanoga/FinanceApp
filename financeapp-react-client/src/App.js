import React from "react";
import "./App.css";
import MarketWatch from "./components/MarketWatch/MarketWatch";
import Dashboard from "./components/Dashboard";
import Header from "./components/Layout/Header";
import "bootstrap/dist/css/bootstrap.min.css";
import { BrowserRouter as Router, Route } from "react-router-dom";
import AddPortfolio from "./components/Portfolio/AddPortfolio";
import { Provider } from "react-redux";
import store from "./store";

function App() {
  return (
    <Provider store={store}>
      <Router>
        <div className="App">
          <Header />
          <MarketWatch />
          <Route exact path="/dashboard" component={Dashboard} />
          <Route exact path="/addPortfolio" component={AddPortfolio} />
        </div>
      </Router>
    </Provider>
  );
}

export default App;
