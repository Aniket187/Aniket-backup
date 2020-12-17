import React from "react";

function Product({ item, addToCart }) {
  return (
    <div style={{ width: "25%" }}>
      <img alt="" src={item["product-image-url"]} />
      <div>
        {item["product-name"]}
        <br />
        <button type="button" onClick={() => addToCart(item)}>
          Add to Cart
        </button>
      </div>
    </div>
  );
}

export default Product;
