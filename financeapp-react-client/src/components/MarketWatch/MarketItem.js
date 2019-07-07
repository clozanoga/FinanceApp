import React, { Component } from "react";

class MarketItem extends Component {
  render() {
    const { market } = this.props;
    return (
      <div className="container">
        <p>
          {market.symbol}&nbsp;{market.price}
          {market.fiatCurrency}&nbsp;|
        </p>
      </div>
    );
  }
}

export default MarketItem;
