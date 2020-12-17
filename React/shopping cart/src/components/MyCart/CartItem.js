import React from "react";

function CartItem({ item }) {
  return (
    <div style={{ width: "25%" }}>
      <img src={item["product-image-url"]} alt="" />
      <div>
        <span>{item["product-name"]}</span>
      </div>
      <div>
        <span>Quantity : {item.Quantity}</span>
      </div>
    </div>
  );
}

export default CartItem;
