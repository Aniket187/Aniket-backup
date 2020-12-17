import React from "react";
import { connect } from "react-redux";
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";
import ErrorBoundary from "./ErrorBoundary";
import Dashboard from "./components/Dashboard";
import MyCart from "./components/MyCart/CartList";
import Header from "./components/Header";

function App({ cartItems }) {
  return (
    <ErrorBoundary>
      <Router>
        <Header count={cartItems.length} />
        <Switch>
          <Route path="/myCart" component={MyCart} />
          <Route path="/" component={Dashboard} />
        </Switch>
      </Router>
    </ErrorBoundary>
  );
}

const mapStateToProps = state => ({
  cartItems: state.myCartReducer.cartItems
});

export default connect(mapStateToProps)(App);
