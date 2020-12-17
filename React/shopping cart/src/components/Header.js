import React from "react";
import { withRouter } from "react-router-dom";
import { Link } from "react-router-dom";

function Header({ count, location }) {
  return (
    <div className="cart-header">
      {location.pathname === "/myCart" ? (
        <Link to="/" className="btn btn-primary">
          <img src="left-black-arrow.png" height="50px" width="50px" alt="" />
        </Link>
      ) : null}
      <span>
        <Link to="/myCart" className="btn btn-primary">
          <img src="shopping-cart.png" height="30px" width="30px" alt="" />
          {count}
        </Link>
      </span>
    </div>
  );
}

export default withRouter(Header);
