import React, { Component } from "react";
import PortfolioItem from "./Portfolio/PortfolioItem";
import CreatePortfolioButton from "./Portfolio/CreatePortfolioButton";

class Dashboard extends Component {
  render() {
    return (
      <div className="projects">
        <div className="container">
          <div className="row">
            <div className="col-md-12">
              <h1 className="display-4 text-center">Portfolios</h1>
              <br />
              <CreatePortfolioButton />
              <br />
              <hr />
              <PortfolioItem />
            </div>
          </div>
        </div>
      </div>
    );
  }
}

export default Dashboard;
