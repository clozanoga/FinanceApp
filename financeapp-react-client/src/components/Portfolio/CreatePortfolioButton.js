import React from "react";
import { Link } from "react-router-dom";

const CreatePortfolioButton = () => {
  return (
    <React.Fragment>
      <Link to="/addPortfolio" className="btn btn-lg btn-info">
        Create a Portfolio
      </Link>
    </React.Fragment>
  );
};

export default CreatePortfolioButton;
