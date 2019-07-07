import React, { Component } from "react";

class AddPortfolio extends Component {
  constructor() {
    super();

    this.state = {
      portfolioName: "",
      portfolioIdentifier: "",
      description: "",
      creation_date: ""
    };

    this.onChange = this.onChange.bind(this);
    this.onSubmit = this.onSubmit.bind(this);
  }

  onChange(e) {
    this.setState({ [e.target.name]: e.target.value });
  }

  onSubmit(e) {
    e.preventDefault();
    const newPortfolio = {
      portfolioName: this.state.portfolioName,
      portfolioIdentifier: this.state.portfolioIdentifier,
      description: this.state.description,
      creation_date: this.state.creation_date
    };

    console.log(newPortfolio);
  }

  render() {
    return (
      <div className="register">
        {
          // check name attribute import
          // create constructor
          // set state
          // set value on input fields
          // create onChange function
          // bind on constructor
          // check state change in react extension
        }
        <div className="container">
          <div className="row">
            <div className="col-md-8 m-auto">
              <h5 className="display-4 text-center">Create Portfolio form</h5>
              <hr />
              <form onSubmit={this.onSubmit}>
                <div className="form-group">
                  <input
                    type="text"
                    className="form-control form-control-lg "
                    placeholder="Portfolio Name"
                    name="portfolioName"
                    value={this.state.portfolioName}
                    onChange={this.onChange}
                  />
                </div>
                <div className="form-group">
                  <input
                    type="text"
                    className="form-control form-control-lg"
                    placeholder="Unique Portfolio ID"
                    name="portfolioIdentifier"
                    value={this.state.portfolioIdentifier}
                    onChange={this.onChange}
                  />
                </div>
                <div className="form-group">
                  <textarea
                    class="form-control form-control-lg"
                    placeholder="Portfolio Description"
                    name="description"
                    value={this.state.description}
                    onChange={this.onChange}
                  />
                </div>
                <h6>Creation Date</h6>
                <div className="form-group">
                  <input
                    type="date"
                    className="form-control form-control-lg"
                    name="creationDate"
                    value={this.state.creation_date}
                    onChange={this.onChange}
                  />
                </div>

                <input
                  type="submit"
                  className="btn btn-primary btn-block mt-4"
                />
              </form>
            </div>
          </div>
        </div>
      </div>
    );
  }
}

export default AddPortfolio;
