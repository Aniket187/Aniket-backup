import React from "react";
import Product from "./Product";

function List({ productData, addToCart }) {
  return (
    <>
      <div className="flex-container">
        {productData.map((productItem, index) => {
          return (
            <Product key={index} item={productItem} addToCart={addToCart} />
          );
        })}
      </div>
    </>
  );
}

export default List;
