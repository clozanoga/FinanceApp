import React, { Component } from "react";
import { connect } from "react-redux";
import { getMarketWatch } from "../../actions/MarketWatchActions";
import PropTypes from "prop-types";
import MarketItem from "./MarketItem";

class MarketWatch extends Component {
  componentDidMount() {
    this.props.getMarketWatch();
  }

  render() {
    const { markets } = this.props.market;
    return (
      <div className="container">
        {markets.map(market => (
          <MarketItem key={market.symbol} market={market} />
        ))}
      </div>
    );
  }
}

MarketWatch.propTypes = {
  market: PropTypes.object.isRequired,
  getMarketWatch: PropTypes.func.isRequired
};

const mapStateToProps = state => ({
  market: state.market
});

export default connect(
  mapStateToProps,
  { getMarketWatch }
)(MarketWatch);
