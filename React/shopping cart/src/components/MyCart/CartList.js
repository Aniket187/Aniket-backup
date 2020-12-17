import React from "react";
import { connect } from "react-redux";
import CartItem from "./CartItem";

class CartList extends React.PureComponent {
  componentDidMount() {}

  render() {
    const { cartItems } = this.props;
    return (
      <div className="flex-container">
        {cartItems.length > 0 ? (
          cartItems.map((item, index) => {
            return <CartItem item={item} key={index} />;
          })
        ) : (
          <h2>Empty Cart</h2>
        )}
      </div>
    );
  }
}

const mapStateToProps = state => ({
  cartItems: state.myCartReducer.cartItems
});

export default connect(mapStateToProps)(CartList);
