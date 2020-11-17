import React, { Component } from "react";
import PropTypes from "prop-types";
import { connect } from "react-redux";
import { createPortfolio } from "../../actions/portfolioActions";

class AddPortfolio extends Component {
  constructor() {
    super();

    this.state = {
      name: "",
      description: "",
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
      name: this.state.name,
      description: this.state.description,
    };
    this.props.createPortfolio(newPortfolio, this.props.history);
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
                    name="name"
                    value={this.state.name}
                    onChange={this.onChange}
                  />
                </div>
                <div className="form-group">
                  <textarea
                    className="form-control form-control-lg"
                    placeholder="Portfolio Description"
                    name="description"
                    value={this.state.description}
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

AddPortfolio.propTypes = {
  createPortfolio: PropTypes.func.isRequired,
};

export default connect(null, { createPortfolio })(AddPortfolio);
