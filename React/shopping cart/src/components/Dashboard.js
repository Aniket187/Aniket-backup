import React, { Component } from "react";
import { connect } from "react-redux";
import ProductList from "./Products/List";
import { saveProductData } from "../reducers/productReducer";
import { addToCart } from "../reducers/myCartReducer";

class Dashboard extends Component {
  componentDidMount() {
    fetch("/Products.json")
      .then(x => x.json())
      .then(response => {
        this.props.getProductList(response);
      })
      .catch(error => {
        console.log(error);
      });
  }

  addToCart(data) {
    this.props.addToCart(data);
  }

  render() {
    const { products } = this.props;
    return products ? (
      <div>
        <ProductList
          productData={products}
          addToCart={data => this.addToCart(data)}
        />
      </div>
    ) : null;
  }
}

const mapStateToProps = state => ({
  products: state.productReducer.products,
  cartItems: state.myCartReducer.cartItems
});

const mapDispatchToProps = dispatch => {
  return {
    getProductList: data => dispatch(saveProductData(data)),
    addToCart: data => dispatch(addToCart(data))
  };
};

export default connect(mapStateToProps, mapDispatchToProps)(Dashboard);
