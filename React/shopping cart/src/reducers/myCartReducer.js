export function addToCart(data) {
  return { type: "ADD_TO_CART", payload: { ...data, Quantity: 1 } };
}

const initialState = {
  cartItems: []
};

const myCartReducer = (state = initialState, action) => {
  switch (action.type) {
    case "ADD_TO_CART":
      const product = action.payload;
      const cart = state.cartItems;

      const existingProductIndex = findProductIndex(cart, product.productId);

      const updatedCart =
        existingProductIndex >= 0
          ? updateProductUnits(cart, product)
          : [...cart, product];

      return { cartItems: updatedCart };

    default:
      return state;
  }
};

const findProductIndex = (cart, productID) => {
  return cart.findIndex(p => p.productId === productID);
};

const updateProductUnits = (cart, product) => {
  const productIndex = findProductIndex(cart, product.productId);

  const updatedCart = [...cart];
  const existingProduct = updatedCart[productIndex];

  const updatedUnitsProduct = {
    ...existingProduct,
    Quantity: existingProduct.Quantity + 1
  };
  updatedCart[productIndex] = updatedUnitsProduct;

  return updatedCart;
};

export default myCartReducer;
