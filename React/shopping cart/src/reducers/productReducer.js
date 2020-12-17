export function saveProductData(data) {
  return { type: "SAVE_PRODUCT_LIST", payload: data };
}

const productReducer = (state = [], action) => {
  switch (action.type) {
    case "SAVE_PRODUCT_LIST":
      return { ...state, products: action.payload };
    default:
      return state;
  }
};

export default productReducer;
